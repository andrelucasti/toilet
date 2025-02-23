package io.andrelucas.business

class CreateNewToiletByAnonymousOwner(private val toiletRepository: ToiletRepository) {

    fun execute(createToiletByAnonymousOwnerRequest: CreateToiletByAnonymousOwnerRequest) {
        val toilet = Toilet.create(createToiletByAnonymousOwnerRequest.name,
            createToiletByAnonymousOwnerRequest.latitude, createToiletByAnonymousOwnerRequest.longitude,
            createToiletByAnonymousOwnerRequest.ownerId())

        toiletRepository.save(toilet)
    }
}