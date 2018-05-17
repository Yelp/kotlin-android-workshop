import android.view.View
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

fun Disposable.addTo(composite: CompositeDisposable) = let(composite::add)
val disposables = CompositeDisposable()
Observable.fromArray(*(1L..500L).toList().toTypedArray())
        .filter { it % 2L == 0L}
        .doOnNext(Thread::sleep)
        .subscribeOn(Schedulers.computation())
        .observeOn(Schedulers.computation())
        .subscribe { println("$it") }
        .addTo(disposables)

Thread.sleep(500)
disposables.clear()

val listener = View.OnClickListener {}
val view: View? = null

if (view != null) listener.onClick(view)
view?.let(listener::onClick)