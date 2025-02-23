package io.andrelucas.business

class CreateNewToiletByAnonymousOwner(private val toiletRepository: ToiletRepository) {

    fun execute(anonymousToiletRequest: AnonymousToiletRequest) {
        val toilet = Toilet.createByAnonymous(anonymousToiletRequest.name,
            anonymousToiletRequest.latitude, anonymousToiletRequest.longitude,
            anonymousToiletRequest.ownerId())

        toiletRepository.save(toilet)
    }
}