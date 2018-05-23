package my.demo.app4.model

import android.arch.lifecycle.ViewModel
import io.reactivex.Single
import my.demo.common.Factory
import my.demo.common.Provider

open class BusinessRepo : ViewModel() {
    companion object : Factory<BusinessRepo> by Provider({ BusinessRepo() })

    open fun search(term: String): Single<List<Business>> {
        return Single.just(listOf())
    }
}