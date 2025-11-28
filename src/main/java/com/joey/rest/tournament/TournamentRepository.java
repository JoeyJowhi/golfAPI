package com.joey.rest.tournament;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;


@Repository
public interface TournamentRepository extends CrudRepository<Tournament, Long> {
    public List<Tournament> findByStartDate(LocalDate startDate);

    public List<Tournament> findByLocation(String location);
}