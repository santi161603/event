package com.uni.proyecto.event.domain.usecase

import com.uni.proyecto.event.domain.repository.AuthenticationRepository

class LoginUseCase constructor(private val authenticationRepository: AuthenticationRepository){

    suspend operator fun invoke(email: String, password: String): Result<Boolean> {
        return authenticationRepository.login(email, password)
    }

}