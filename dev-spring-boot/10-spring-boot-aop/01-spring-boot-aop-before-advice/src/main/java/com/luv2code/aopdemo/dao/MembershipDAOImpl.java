package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO {
    @Override
    public void addSillyMember() {
        System.out.println(getClass() + " Membership Account added Successfully!!!!");
    }

    @Override
    public void goToSlepp() {
        System.out.println(getClass() + " Membership Account added Successfully!!!!");
    }
}
