package com.suraksha.setu.data.model

import com.google.firebase.Timestamp

data class Emergency(
    val id: String = "",
    val userId: String = "",
    val userName: String = "",
    val timestamp: Timestamp = Timestamp.now(),
    val latitude: Double = 0.0,
    val longitude: Double = 0.0,
    val status: String = "ACTIVE", // ACTIVE, RESOLVED
    val message: String = ""
)
