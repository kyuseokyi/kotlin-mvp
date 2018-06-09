package com.test.app_mvp_kotlin.model

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import rx.Observable

/**
 * Created by justluvher on 2018. 6. 6..
 */

interface GitHubServices {

    /**
     * github의 리포지트리 검색결과를 가져온다.
     * @param query github api로 검색할 내용.
     * @return api 엑세스 결과 취득 후 콜백으로서 searchResponse 자져올 수 있는 observable을 리턴하다.
     */
    @GET("search/repositories?sort=stars&orde=desc")
    fun listRepos(@Query("q") query: String) : Observable<Repositories>;

    /**
     * 리포지토리 상세 내역을 가져온다
     * https://developer.github.com/v3/repos/#get
     * @return API 액세스 결과 취득 후의 콜백으로서 RepositoryItem을 가져올 수 있는 RxJava의 Observable로 반환한다
     */
    @GET("repos/{repoOwner}/{repoName}")
    fun detailRepo(@Path("repoOwner") owner : String, @Path("repoName") repoName : String);

    // RepositoryItem model 정의
    data class RepositoryItem(
            val description : String,
            val owner : Owner,
            val language : String,
            val name : String,
            val starazers_count : String,
            val forks_count : String,
            val html_url : String
    )

    class Repositories {
        val items : List<RepositoryItem>;

        constructor(items: List<RepositoryItem>) {
            this.items = items
        }
    }

    // Owner model 정의
    data class Owner(
            val received_events_url : String,
            val organizations_url : String,
            val avatar_rul : String,
            val gravatar_id : String,
            val gists_url : String,
            val starred_url : String,
            val site_admin : String,
            val type : String,
            val url : String,
            val id : String,
            val html_url : String,
            val following_rul : String,
            val events_url : String,
            val login : String,
            val subscriptions_url : String,
            val repos_url : String,
            val followers_url : String
    )
}

