package com.test.app_mvp_kotlin.contract

/**
 * Created by justluvher on 2018. 6. 6..
 *
 * Deatail Activity 와 Detail preseneter에서 사용할 interface를 정의한다.
 *
 * Detail activity 와 dEtail presenter과의 계약을 선언한다.
 * 사용자의 UI 이벤트를 처리하기 위한 용도이다.
 */

interface DetailContract {

    //detail view에서 구현할 인터페이스를 정의한다.
    interface View {
        fun getFullRepositorName(): String;
        fun showRespositoryInfo();
        fun startBrowser(url: String);
        fun shwoError(message: String);
    }

    //detail presenter에서 구현할 인테페이스르 정의한다.
    interface UserActions {
        fun titleClick();
        fun prepare();
    }
}