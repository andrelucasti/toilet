package io.andrelucas.business

import java.util.UUID

data class Toilet(val name: String, val geolocation: Geolocation, val owner: Owner) {

    companion object {
        fun createByAnonymous(name: String,
                              latitude: Double,
                              longitude: Double,
                              ownerId: UUID): Toilet {

            val geolocation = Geolocation(latitude, longitude)
            val owner = Owner(ownerId, "Anonymous")
            return Toilet(name, geolocation, owner)
        }
    }
}
