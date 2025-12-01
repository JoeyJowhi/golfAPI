package com.joey.rest.member;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.joey.rest.tournament.Tournament;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;

import java.time.LocalDate;
import java.util.List;


@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name, address, emailAddress;

    @Column(unique = true)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private MembershipType membershipType;
    public enum MembershipType {
        STANDARD,
        GOLD,
        DIAMOND;


        @JsonCreator
        public static MembershipType fromString(String value) {
            return MembershipType.valueOf(value.toUpperCase());
        }
    }

    private LocalDate membershipStartDate;
    private double membershipDuration;


    public Long getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public MembershipType getMembershipType() {
        return this.membershipType;
    }

    public LocalDate getMembershipStartDate() {
        return this.membershipStartDate;
    }

    public double getMembershipDuration() {
        return this.membershipDuration;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    public void setMembershipStartDate(LocalDate membershipStartDate) {
        this.membershipStartDate = membershipStartDate;
    }

    public void setMembershipDuration(double membershipDuration) {
        this.membershipDuration = membershipDuration;
    }
}