package com.test.app_mvp.contract;

import com.test.app_mvp.model.GitHubService;

/**
 * Created by justluvher on 2018. 5. 30..
 */

public interface RepositoryListContract {

    //mvp에서 activity가 구현할 view 인터페이스
    //뷰을 업데이트 한다.
    interface View {
        String getSelectedLanguage();
        void showProgress();
        void hideProgress();
        void showRepositories(GitHubService.Repositories repositories);
        void showError();
        void startDetailActivity(String fullRepositoryName);
    }

    //activity에서 user 이벤트 인터페이스
    interface UserActions {
        void selectLanguage(String language);
        void selectRepositoryItem(GitHubService.RepositoryItem item);
    }
}
