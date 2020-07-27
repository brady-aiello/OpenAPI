package com.codingwithmitch.openapi.repository.auth

import androidx.lifecycle.LiveData
import com.codingwithmitch.openapi.api.auth.OpenApiAuthService
import com.codingwithmitch.openapi.api.auth.networkresponses.LoginResponse
import com.codingwithmitch.openapi.api.auth.networkresponses.RegistrationResponse
import com.codingwithmitch.openapi.persistence.AccountPropertiesDao
import com.codingwithmitch.openapi.persistence.AuthTokenDao
import com.codingwithmitch.openapi.session.SessionManager
import com.codingwithmitch.openapi.util.GenericApiResponse

class AuthRepository constructor(
    val authTokenDao: AuthTokenDao,
    val accountPropertiesDao: AccountPropertiesDao,
    val openApiAuthService: OpenApiAuthService,
    val sessionManager: SessionManager
) {
    fun testLoginRequest(email: String, password: String):
            LiveData<GenericApiResponse<LoginResponse>> =
        openApiAuthService.login(email, password)

    fun testRegistrationRequest(email: String, username: String,
                                password: String, confirmPassword: String):
            LiveData<GenericApiResponse<RegistrationResponse>> =
        openApiAuthService.register(email, username, password, confirmPassword)
}