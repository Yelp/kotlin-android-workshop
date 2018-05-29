package my.demo.app6.model

import io.reactivex.Single
import my.demo.common.Factory
import my.demo.common.Provider
import my.demo.common.api

open class BusinessRepo {
    companion object : Factory<BusinessRepo> by Provider({ BusinessRepo() })

    open fun search(term: String): Single<BusinessSearchResponse> {
        return api<BusinessSearch>().search(term)
    }
}