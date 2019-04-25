package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {
        AthleteCreationInjector injector;
        Processor app;

        // Create a Track Athlete
        String athlete = "Track Athlete";

        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete(trackAthlete);

        // Create a Hockey Athlete
        String athlete = "Hockey Athlete";

        injector = new HockeyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete(hockeyAthlete);


        // Create a Rugby Athlete
        String athlete = "Rugby Athlete";

        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete(rugbyAthlete);

        // Create a Baseball Athlete
        String athlete = "Baseball Athlete";

        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete(baseballAthlete);

    }
}
