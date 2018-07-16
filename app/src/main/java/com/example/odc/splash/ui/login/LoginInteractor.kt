package com.example.odc.splash.ui.login

import android.content.Context
import com.example.odc.splash.network.model.UserInformationAuth
import com.example.odc.splash.network.serivce.Authetification

class LoginInteractor {

    var context: Context
    var auth: Authetification

    constructor(context: Context) {
        this.context = context
        this.auth = Authetification(context)
    }

    interface OnLoginFinishedListener<T> {
        fun onUsernameError()
        fun onPasswordError()
        fun onReceive()
        fun onSuccess(result:T)
        fun onError(errorMessage:String)
    }

    fun login(url : String, username: String, password: String, listener: OnLoginFinishedListener<UserInformationAuth>) {
        auth.login(url, username,password,listener)
    }
}