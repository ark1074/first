package com.springinaction.knights;

import java.io.PrintStream;

public class Minstrel {

    private PrintStream stream;

    public Minstrel (PrintStream stream){
        this.stream = stream;
    }
    public void singBeforeQuest() {
        stream.println("Knight is so brave ");
    }

    public void singAfterQuest() {
        stream.println("Knight did embark on quest");
    }

}
