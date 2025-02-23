package io.andrelucas.business

interface ToiletRepository {
    fun save(toilet: Toilet)
    fun findAll(): List<Toilet>
}