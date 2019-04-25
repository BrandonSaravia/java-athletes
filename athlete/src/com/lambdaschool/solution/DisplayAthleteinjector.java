package com.lambdaschool.solution;

public class DisplayAthleteinjector implements AthleteServiceInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new AthleteInjectorImpl());
    }
}