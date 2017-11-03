package com.company.State;

import com.company.Context.GumMachine;

public class SoldOutState implements State {
    private GumMachine gumMachine;

    public SoldOutState(GumMachine gumMachine) {
        this.gumMachine = gumMachine;
    }

    @Override
    public void insertCoin() {
        gumMachine.displayMessage("You didn't insert coin! All gums are sold out!!!");
    }

    @Override
    public void ejectCoin() {
        gumMachine.displayMessage("You didn't return coin! All gums are sold out!!!");
    }

    @Override
    public void flipLatch() {
        gumMachine.displayMessage("You didn't flip the latch! All gums are sold out!!!");
    }

    @Override
    public void dispenseGum() {
    }
}
