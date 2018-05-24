package my.demo.common

import com.yelp.android.apis.bizapp.tools.Converters
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import kotlin.reflect.KClass
import okhttp3.OkHttpClient

private const val AUTH = "Bearer NQISPs8iEEYN3gqoDkU5lU8ooRG23nSF9134tzyulLhBY6rbEWw87wnI9yg8UdR6QbFLGV17gsmlSS_OiimJWlAVv1Yu1fRvGabZirAYJNFnA3Joh0vmuyEyRU0EW3Yx"

object Apis {
    private val client = OkHttpClient.Builder().addNetworkInterceptor {
        it.proceed(it.request().newBuilder().addHeader("Authorization", AUTH).build())
    }.build()

    operator fun <T : Any> get(service: KClass<T>): T {
        return create(service.java)
    }

    private fun <T> create(service: Class<T>): T {
        return Retrofit.Builder()
                .baseUrl("https://api.yelp.com/")
                .client(client)
                .addCallAdapterFactory(RxJava2SchedulerCallAdapterFactory(client))
                .addConverterFactory(Converters.converterFactory())
                .build()
                .create(service)
    }
}
