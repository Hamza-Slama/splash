package com.example.odc.splash.ui.login

import com.example.odc.splash.network.model.UserInformationAuth


class LoginPresenter(var loginView: LoginView?, val loginInteractor: LoginInteractor) {


    fun validateLogin(url : String, username: String, password: String) {
        loginView?.showProgress()
        loginInteractor.login(url, username,password, object : LoginInteractor.OnLoginFinishedListener<UserInformationAuth> {
            override fun onUsernameError() {

                loginView?.apply {
                    setUsernameError()
                    hideProgress()
                }
            }

            override fun onPasswordError() {
                loginView?.apply {
                    setPasswordError()
                    hideProgress()
                }
            }

            override fun onSuccess(result : UserInformationAuth) {
                loginView?.apply {
                    navigateToHome()
                }
                //loginView?.navigateToHome()
            }

            override fun onReceive() {
                loginView?.showProgress()
            }

            override fun onError(errorMessage: String) {
                loginView?.hideProgress()
            }

        })
    }

    fun onDestroy() {
        loginView = null
    }

}