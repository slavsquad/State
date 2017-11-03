package com.company.State;

import com.company.Context.GumMachine;

public class HasCoinState implements State {
    private GumMachine gumMachine;

    public HasCoinState(GumMachine gumMachine) {
        this.gumMachine = gumMachine;
    }

    @Override
    public void insertCoin() {
        gumMachine.displayMessage("You can't insert another coin!");
    }

    @Override
    public void ejectCoin() {
        gumMachine.displayMessage("Take your coin back!");
        gumMachine.setState(new NoCoinState(gumMachine));
    }

    @Override
    public void flipLatch() {
        gumMachine.setState(new SoldGumState(gumMachine));
        gumMachine.displayMessage("Please wait ...");
    }

    @Override
    public void dispenseGum() {
    }
}
