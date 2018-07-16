package com.example.odc.splash.network.serivce

import android.content.Context
import com.example.odc.splash.ui.login.LoginInteractor
import com.example.odc.splash.network.model.UserInformationAuth

class Authetification (var context : Context){

    fun login(url :String , email: String, password: String, listener: LoginInteractor.OnLoginFinishedListener<UserInformationAuth>) :String {
        return ""
    }
}