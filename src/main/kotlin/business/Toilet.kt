package io.andrelucas.business

import java.util.UUID

data class Toilet(val name: String, val geolocation: Geolocation, val ownerId: UUID) {

    companion object {
        fun create(name: String,
                   latitude: Double,
                   longitude: Double,
                   ownerId: UUID): Toilet {

            val geolocation = Geolocation(latitude, longitude)

            return Toilet(name, geolocation, ownerId)
        }
    }
}
