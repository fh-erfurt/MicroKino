package de.fherfurt.cinemaservice.repositories

import de.fherfurt.cinemaservice.models.Cinema
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CinemaRepository : CrudRepository<Cinema, Long> {
    fun findCinemaById(cinemaId: Long): Cinema
}