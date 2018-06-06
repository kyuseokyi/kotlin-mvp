package com.test.app_mvp_kotlin.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.test.app_mvp_kotlin.R
import com.test.app_mvp_kotlin.contract.DetailContract

class DetailActivity : AppCompatActivity(), DetailContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun getFullRepositorName(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showRespositoryInfo() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun startBrowser(url: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun shwoError(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}