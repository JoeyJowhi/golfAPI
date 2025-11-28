package com.joey.rest.tournament;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Service
public class TournamentService {
    @Autowired private TournamentRepository tournamentRepository;


    public List<Tournament> getAllTournaments() {
        return (List<Tournament>) tournamentRepository.findAll();
    }

    public Tournament getTournamentById(Long id) {
        Optional<Tournament> tournamentOptional = tournamentRepository.findById(id);

        return tournamentOptional.orElse(null);
    }

    public List<Tournament> getTournamentsByStartDate(LocalDate startDate) {
        return tournamentRepository.findByStartDate(startDate);
    }

    public List<Tournament> getTournamentsByLocation(String location) {
        return tournamentRepository.findByLocation(location);
    }


    public Tournament postTournament(Tournament newTournament) {
        return tournamentRepository.save(newTournament);
    }
}