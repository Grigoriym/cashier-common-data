package com.grappim.common_data.model.waybill

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FilterWaybillsResponseDTO(
    @SerialName("waybills")
    val waybills: List<WaybillDTO>
)
