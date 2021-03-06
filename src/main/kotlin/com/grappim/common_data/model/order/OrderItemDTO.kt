package com.grappim.data_service.model.order

import com.grappim.common_data.serializer.BigDecimalSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.math.BigDecimal

@Serializable
data class OrderItemDTO(
  @SerialName("productId")
  val productId: Long,
  @SerialName("amount")
  @Serializable(BigDecimalSerializer::class)
  val amount: BigDecimal,
  @SerialName("sellingPrice")
  @Serializable(BigDecimalSerializer::class)
  val sellingPrice: BigDecimal,
  @SerialName("purchasePrice")
  @Serializable(BigDecimalSerializer::class)
  val purchasePrice: BigDecimal,
  @SerialName("barcode")
  val barcode: String,
  @SerialName("name")
  val name: String
)