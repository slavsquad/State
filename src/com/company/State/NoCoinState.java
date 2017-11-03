package com.company.State;

import com.company.Context.GumMachine;

public class NoCoinState implements State {
    private GumMachine gumMachine;

    public NoCoinState(GumMachine gumMachine) {
        this.gumMachine = gumMachine;
    }

    @Override
    public void insertCoin() {
        gumMachine.setState(new HasCoinState(gumMachine));
        gumMachine.displayMessage("Flip the latch for release gum ball");
    }

    @Override
    public void ejectCoin() {
        gumMachine.displayMessage("You can't return the coin because you didn't insert it!");
    }

    @Override
    public void flipLatch() {
        gumMachine.displayMessage("Firstly, insert the coin then flip the latch!");
    }

    @Override
    public void dispenseGum() {

    }
}
