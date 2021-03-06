package com.grappim.common_data.model.basket

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SubtractBasketProductResponseDTO(
    @SerialName("basketProduct")
    val basketProduct: BasketProductDTO?,
    @SerialName("isRemoved")
    val isRemoved: Boolean
)