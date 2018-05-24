package my.demo.app5.model

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface BusinessSearch {
        @GET("v3/businesses/search?location=SF")
        fun search(@Query("term")term: String): Single<BusinessSearchResponse>
}