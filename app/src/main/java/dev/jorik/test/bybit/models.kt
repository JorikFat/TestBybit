package dev.jorik.test.bybit

import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("retCode") val code :Int,
    @SerializedName("retMsg") val message :String,
    @SerializedName("result") val result :Result,
    @SerializedName("retExtInfo") val info :Any,
    @SerializedName("time") val time :Long,
)

data class Result(
    @SerializedName("total")val total :Int,
    @SerializedName("list")val list :List<Item>
)

data class Item(
    @SerializedName("title") val title :String,
    @SerializedName("description") val description :String,
    @SerializedName("type") val type :Type,
    @SerializedName("tags") val tags :List<String>,
    @SerializedName("url") val url :String,
    @SerializedName("dateTimestamp") val timestamp :Long,
    @SerializedName("startDateTimestamp") val startDate :Long,
    @SerializedName("endDateTimestamp") val endDate :Long,
)

data class Type(
    @SerializedName("title") val title :String,
    @SerializedName("key") val key :String,
)