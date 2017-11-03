package com.company.Context;

import com.company.State.*;

public class GumMachine {
    private int gumCount = 0;
    private int coins = 9;
    private State state;

    public GumMachine(int gumCount) {
        this.gumCount = gumCount;
        this.coins = 0;
        if(gumCount>0){
            state = new NoCoinState(this);
            displayMessage("Please insert coin...");
        }else {
            state = new SoldOutState(this);
        }
    }

    public void insertCoint() {
        state.insertCoin();
    }

    public void ejectCoint() {
        state.ejectCoin();
    }

    public void flipLatch() {
        state.flipLatch();
        state.dispenseGum();
    }

    public void releaseGumBall(){
        gumCount--;
    }
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void displayMessage(String message){
        System.out.print((char) 27 + "[32m[DISPLAY]: " + (char)27 + "[0m");
        System.out.println(message);
    }

    public int getGumCount() {
        return gumCount;
    }

    public int getCoins() {
        return coins;
    }

    public void addCoin() {
        coins++;
    }


    public void printStatus() {
        System.out.print((char) 27 + "[31m[STATUS]: " + (char)27 + "[0m");
        System.out.println("[Status] gums: "+gumCount+" coins: "+coins);
    }
}
