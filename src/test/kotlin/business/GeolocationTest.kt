package io.andrelucas.business

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class GeolocationTest : FunSpec({

    test("should return a geolocation when it is created") {
        val geolocation = Geolocation(1.0, 2.0)
        val expected = Geolocation(1.0, 2.0)

        geolocation shouldBe expected
    }

})
