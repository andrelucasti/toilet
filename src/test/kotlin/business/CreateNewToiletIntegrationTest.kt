package io.andrelucas.business

import io.andrelucas.dataprovider.ToiletRepositoryImp
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import java.util.*

class CreateNewToiletIntegrationTest : FunSpec({

    test("should create and return a toilet when it created"){

        val toiletRepository = ToiletRepositoryImp()
        val createNewToiletByAnonymousOwner = CreateNewToiletByAnonymousOwner(toiletRepository)
        val owner = AnonymousOwnerRequest("123")
        val ownerId = UUID.nameUUIDFromBytes(owner.deviceId.toByteArray())
        val request = AnonymousToiletRequest("Vinyl Bar", 1.0, 2.0, owner)


        createNewToiletByAnonymousOwner.execute(request)

        val toilet = toiletRepository.findAll()
            .first()

        toilet.name shouldBe request.name
        toilet.geolocation.latitude shouldBe request.latitude
        toilet.geolocation.longitude shouldBe request.longitude
        toilet.owner shouldBe ownerId
    }

})
