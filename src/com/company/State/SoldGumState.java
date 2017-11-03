package com.company.State;

import com.company.Context.GumMachine;

public class SoldGumState implements State {
    private GumMachine gumMachine;

    public SoldGumState(GumMachine gumMachine) {
        this.gumMachine = gumMachine;
    }

    @Override
    public void insertCoin() {
        gumMachine.displayMessage("You din't insert coin now!!!");
    }

    @Override
    public void ejectCoin() {
        gumMachine.displayMessage("You din't return coin now!!!");
    }

    @Override
    public void flipLatch() {
        gumMachine.displayMessage("You din't return coin now!!!");
    }

    @Override
    public void dispenseGum() {
        gumMachine.releaseGumBall();
        gumMachine.addCoin();
        gumMachine.displayMessage("Take your gum ball!");
        if (gumMachine.getGumCount()>0){
            gumMachine.setState(new NoCoinState(gumMachine));
            gumMachine.displayMessage("Please insert coin...");
        }else {
            gumMachine.setState(new SoldOutState(gumMachine));
            gumMachine.displayMessage("All gums are sold out!!!");
        }
    }
}
