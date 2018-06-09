package com.test.app_mvp_kotlin.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.test.app_mvp_kotlin.R
import com.test.app_mvp_kotlin.contract.RepositoryListcontract

class RepositoryListActivity : AppCompatActivity(), RepositoryListcontract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repository_list)
    }

    override fun getSelectedLanguage(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showRepositories() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun startDetailActivity(fullRepositoryName: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
