package com.joey.rest.member;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Service
public class MemberService {
    @Autowired private MemberRepository memberRepository;


    public List<Member> getAllMembers() {
        return (List<Member>) memberRepository.findAll();
    }

    public Member getMemberById(Long id) {
        Optional<Member> memberOptional = memberRepository.findById(id);

        return memberOptional.orElse(null);
    }

    public List<Member> getMembersByName(String name) {
        return memberRepository.findAllByName(name);
    }

    public Member getMemberByPhoneNumber(String phoneNumber) {
        return memberRepository.findByPhoneNumber(phoneNumber);
    }

    public List<Member> getMembersByMembershipStartDate(LocalDate date) {
        return memberRepository.findAllByMembershipStartDate(date);
    }

    public List<Member> getMembersByMembershipType(String membershipType) {
        return memberRepository.findAllByMembershipType(Member.MembershipType.fromString(membershipType));
    }


    public Member postMember(Member newMember) {
        return memberRepository.save(newMember);
    }
}