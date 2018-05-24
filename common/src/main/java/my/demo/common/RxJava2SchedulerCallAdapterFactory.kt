package my.demo.common

import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.CallAdapter
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import java.lang.reflect.Type

class RxJava2SchedulerCallAdapterFactory internal constructor(
        okHttpClient: OkHttpClient
) : CallAdapter.Factory() {

    private val subscribeScheduler: Scheduler =
            Schedulers.from(okHttpClient.dispatcher().executorService())
    private val observeScheduler: Scheduler = AndroidSchedulers.mainThread()
    private val wrappedFactory: RxJava2CallAdapterFactory = RxJava2CallAdapterFactory.create()

    override fun get(
            returnType: Type,
            annotations: Array<Annotation>,
            retrofit: Retrofit
    ): CallAdapter<*, *>? {
        val callAdapter = wrappedFactory.get(returnType, annotations, retrofit) ?: return null

        return CallAdapterWrapper(callAdapter)
    }

    private inner class CallAdapterWrapper<R> internal constructor(
            private val wrappedAdapter: CallAdapter<R, *>
    ) : CallAdapter<R, Any> {

        override fun responseType(): Type {
            return wrappedAdapter.responseType()
        }

        override fun adapt(call: Call<R>): Any {
            val it: Any = wrappedAdapter.adapt(call)
            return when (it) {
                is Flowable<*> -> it.subscribeOn(subscribeScheduler).observeOn(observeScheduler)
                is Observable<*> -> it.subscribeOn(subscribeScheduler).observeOn(observeScheduler)
                is Single<*> -> it.subscribeOn(subscribeScheduler).observeOn(observeScheduler)
                is Maybe<*> -> it.subscribeOn(subscribeScheduler).observeOn(observeScheduler)
                is Completable -> it.subscribeOn(subscribeScheduler).observeOn(observeScheduler)
                else -> it
            }
        }
    }
}
