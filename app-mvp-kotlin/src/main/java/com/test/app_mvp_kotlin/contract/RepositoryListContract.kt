package com.test.app_mvp_kotlin.contract

/**
 * Created by justluvher on 2018. 6. 6..
 */

interface RepositoryListcontract {

    //Repository activty가 구현할 view 인터페이스를 정의한다.
    //뷰를 업데이트 한다.
    interface View {
        fun getSelectedLanguage(): String;
        fun showProgress();
        fun hideProgress();
        fun showRepositories();
        fun startDetailActivity(fullRepositoryName: String);
    }

    //Repository activity가 구현할 user 이벤트 인터페이스를 정의한다.
    interface UserActions {
        fun selectLanguage(language: String);
        fun selectRepositoryItem();
    }
}