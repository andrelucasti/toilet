package io.andrelucas.dataprovider

import io.andrelucas.business.Toilet
import io.andrelucas.business.ToiletRepository


class ToiletRepositoryImp : ToiletRepository {
    private val data = ArrayList<Toilet>()

    override fun save(toilet: Toilet) {
        data.add(toilet)
    }

    override fun findAll(): List<Toilet> {
        return data
    }
}