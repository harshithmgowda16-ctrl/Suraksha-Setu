package com.suraksha.setu.data.model

data class SafeCircleMember(
    val id: String = "",
    val fullName: String = "",
    val relationship: String = "",
    val contactNumber: String = "",
    val priority: String = "Medium", // High, Medium, Low
    val notes: String = ""
)
