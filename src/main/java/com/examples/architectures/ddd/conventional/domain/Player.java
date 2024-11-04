package com.examples.architectures.ddd.conventional.domain;

import com.examples.architectures.ddd.conventional.domain.exceptions.MaxWarningReachedException;

public class Player {
    private String name;
    private int setsWon;
    private int warnings;
    private int maxWarnings;

    public Player(String name, int maxWarnings) {
        this.name = name;
        this.warnings = 0;
        this.maxWarnings = maxWarnings;
        setsWon = 0;
    }

    public int addSet () {
        return ++setsWon;
    }

    public void warn() {
        warnings++;
        if(warnings == maxWarnings) {
            throw new MaxWarningReachedException();
        }
    }
}
