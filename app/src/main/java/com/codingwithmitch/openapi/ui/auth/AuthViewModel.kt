package com.codingwithmitch.openapi.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.codingwithmitch.openapi.api.auth.networkresponses.LoginResponse
import com.codingwithmitch.openapi.api.auth.networkresponses.RegistrationResponse
import com.codingwithmitch.openapi.repository.auth.AuthRepository
import com.codingwithmitch.openapi.util.GenericApiResponse
import javax.inject.Inject

class AuthViewModel
@Inject
constructor(
    val authRepository: AuthRepository
): ViewModel(){

    fun testLogin(): LiveData<GenericApiResponse<LoginResponse>> =
            authRepository.testLoginRequest(email = "",
                    password = "")

    fun testRegister(): LiveData<GenericApiResponse<RegistrationResponse>> =
            authRepository.testRegistrationRequest(email = "",
                    username = "", password = "", confirmPassword = "")
}





























