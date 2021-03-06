package com.grappim.common_data.model.user

import com.grappim.common_data.serializer.UUIDSerializer
import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class RegisterUserDTO(
    val phone: String,
    val email: String,
    val password: String
)

@Serializable
data class RegisterUserResponseDTO(
    val phone: String,
    val email: String
)

@Serializable
data class LoginUserDTO(
    val mobile: String,
    val password: String
)

@Serializable
data class LoginUserResponseDTO(
    val token: String,
    @Serializable(UUIDSerializer::class)
    val merchantId: UUID,
    val merchantName: String
)

@Serializable
data class UpdateUserDTO(val user: UserDTO) {
    @Serializable
    data class UserDTO(
        val phone: String,
        val email: String,
        val password: String
    )
}