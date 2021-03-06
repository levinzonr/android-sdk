package dk.nodes.nstack.kotlin.models

import java.util.Date

data class AppOpenData(
    val count: Int = 0,
    val update: AppUpdate = AppUpdate(),
    val localize: List<LocalizeIndex> = listOf(),
    val platform: String = "",
    val createdAt: Date = Date(),
    val lastUpdated: Date = Date(),
    val message: Message? = null,
    val rateReminder: RateReminder? = null,
    val terms: List<Terms> = listOf()
)
