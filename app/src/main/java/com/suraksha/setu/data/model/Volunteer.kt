package com.suraksha.setu.data.model

import com.google.firebase.Timestamp

data class Volunteer(
    val id: String = "",
    val fullName: String = "",
    val phoneNumber: String = "",
    val villageName: String = "",
    val age: Int = 0,
    val gender: String = "",
    val isAvailable: Boolean = false,
    val isVerified: Boolean = false,
    val skills: String = "",
    val latitude: Double = 0.0,
    val longitude: Double = 0.0,
    val lastActive: Timestamp = Timestamp.now()
)

data class EmergencyResponse(
    val id: String = "",
    val emergencyId: String = "",
    val volunteerId: String = "",
    val volunteerName: String = "",
    val status: String = "PENDING", // PENDING, ACCEPTED, REJECTED, RESOLVED
    val timestamp: Timestamp = Timestamp.now(),
    val eta: String = ""
)
