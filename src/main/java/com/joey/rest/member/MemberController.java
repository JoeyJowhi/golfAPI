package com.joey.rest.member;

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
public class MemberController {
    @Autowired private MemberService memberService;

    @GetMapping("/members")
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @GetMapping("/members/{id}")
    public Member getMemberById(@PathVariable Long id) {
        return memberService.getMemberById(id);
    }

    @GetMapping("/members/search/name")
    public List<Member> getMembersByName(@RequestParam String name) {
        return memberService.getMembersByName(name);
    }

    @GetMapping("/members/search/phone")
    public Member getMemberByPhoneNumber(@RequestParam String number) {
        return memberService.getMemberByPhoneNumber(number);
    }

    @GetMapping("/members/search/membership-start")
    public List<Member> getMembersByMembershipStartDate(@RequestParam LocalDate date) {
        return memberService.getMembersByMembershipStartDate(date);
    }

    @GetMapping("/members/search/membership")
    public List<Member> getMembersByMembershipType(@RequestParam String type) {
        return memberService.getMembersByMembershipType(type);
    }


    @PostMapping("/members")
    public Member postMember(@RequestBody Member member) {
        return memberService.postMember(member);
    }
}