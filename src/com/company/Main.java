package com.company;

import com.company.Context.GumMachine;

public class Main {

    public static void main(String[] args) {
        GumMachine gumballMachine =
                new GumMachine(5);


        gumballMachine.insertCoint();
        gumballMachine.flipLatch();
        gumballMachine.insertCoint();
        gumballMachine.flipLatch();

        gumballMachine.printStatus();

        gumballMachine.insertCoint();
        gumballMachine.flipLatch();
        gumballMachine.insertCoint();

        gumballMachine.ejectCoint();
        gumballMachine.flipLatch();

        gumballMachine.printStatus();

        gumballMachine.insertCoint();
        gumballMachine.flipLatch();
        gumballMachine.insertCoint();
        gumballMachine.flipLatch();
        gumballMachine.printStatus();

    }
}
