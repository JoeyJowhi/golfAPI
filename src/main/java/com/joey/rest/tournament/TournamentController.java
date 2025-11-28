package com.joey.rest.tournament;

import com.joey.rest.member.Member;
import com.joey.rest.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.List;


@RestController
public class TournamentController {
    @Autowired private TournamentService tournamentService;
    @Autowired private MemberService memberService;


    @GetMapping("/tournaments")
    public List<Tournament> getAllTournaments() {
        return tournamentService.getAllTournaments();
    }

    @GetMapping("/tournaments/{id}")
    public Tournament getTournamentById(@PathVariable Long id) {
        return tournamentService.getTournamentById(id);
    }

    @GetMapping("/tournaments/search/start")
    public List<Tournament> getTournamentsByStartDate(@RequestParam LocalDate startDate) {
        return tournamentService.getTournamentsByStartDate(startDate);
    }

    @GetMapping("/tournaments/search/location")
    public List<Tournament> getTournamentsByLocation(@RequestParam String location) {
        return tournamentService.getTournamentsByLocation(location);
    }

    @GetMapping("/tournaments/{id}/members")
    public List<Member> getTournamentMembers(@PathVariable Long id) {
        Tournament tournament = tournamentService.getTournamentById(id);
        if (tournament == null) {
            return null;
        }

        return tournament.getParticipatingMembers();
    }


    @PostMapping("/tournaments")
    public Tournament postTournament(@RequestBody Tournament tournament) {
        return tournamentService.postTournament(tournament);
    }

    @PostMapping("/tournaments/{tournamentId}/members/{memberId}")
    public List<Member> postAddMemberToTournament(@PathVariable Long tournamentId, @PathVariable Long memberId) {
        Tournament tournament = tournamentService.getTournamentById(tournamentId);
        if (tournament == null) {
            return null;
        }

        Member member = memberService.getMemberById(memberId);
        if (member == null) {
            return null;
        }

        tournament.getParticipatingMembers().add(member);

        return tournament.getParticipatingMembers();
    }
}