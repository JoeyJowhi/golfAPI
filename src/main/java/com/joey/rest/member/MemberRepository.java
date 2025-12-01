package com.joey.rest.member;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;


@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {
    public List<Member> findAllByName(String name);

    public Member findByPhoneNumber(String phoneNumber);

    public List<Member> findAllByMembershipStartDate(LocalDate date);

    public List<Member> findAllByMembershipType(Member.MembershipType membershipType);
}