package com.lambdaschool.solution;

public class MyApplication implements Processor {

    private AthleteService athlete;

    public MyApplication(MessageService athlete) {
        this.athlete = athlete;
    }


    @Override
    public void displayAthlete(String ath)
    {
        ath ="**************  \n" + ath + "\n  **************";
        athlete.displayAthlete(ath);
    }

}