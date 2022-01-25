package ru.nonsense.bpp;

import javax.annotation.PostConstruct;

@Profiling
public class TerminateQuoterImpl implements Quoter {

    @AssignRandomInt(min = 2, max = 10)
    private int repeatCount;

    public TerminateQuoterImpl() {
        System.out.println("phase 1");
    }

    @PostConstruct
    public void init() {
        System.out.println("phase 2");
    }

    @Override
    public void sayQuoter() {
        System.out.println("phase 3");

        for (var i = 0; i < repeatCount; i++) {
            System.out.println("message =  " + i);
        }
    }
}
