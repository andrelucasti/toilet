package io.andrelucas.business

import java.util.UUID

data class AnonymousToiletRequest(val name: String,
                                  val latitude: Double,
                                  val longitude: Double,
                                  val owner : AnonymousOwnerRequest) {

    fun ownerId(): UUID {
        return UUID.nameUUIDFromBytes(owner.deviceId.toByteArray())
    }
}