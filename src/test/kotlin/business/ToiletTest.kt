package io.andrelucas.business

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import java.util.UUID

class ToiletTest : FunSpec({
    test("should return a toilet when it is created by an anonymous owner") {
        val ownerId = UUID.randomUUID()
        val toilet = Toilet.createByAnonymous("Andre's House", 1.0, 2.0, ownerId)

        val ownerExpected = Owner(ownerId, "Anonymous")
        val expected = Toilet("Andre's House", Geolocation(1.0, 2.0), ownerExpected)

        toilet shouldBe expected
    }
})
