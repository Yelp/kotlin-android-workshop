package my.demo.app5.model

import io.reactivex.Single
import my.demo.common.Apis
import my.demo.common.Factory
import my.demo.common.Provider

open class BusinessRepo {
    companion object : Factory<BusinessRepo> by Provider({ BusinessRepo() })

    open fun search(term: String): Single<BusinessSearchResponse> {
        return Apis[BusinessSearch::class].search(term)
    }
}