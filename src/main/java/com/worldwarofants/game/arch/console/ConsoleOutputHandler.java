package com.worldwarofants.game.arch.console;

import java.util.concurrent.TimeUnit;

public class ConsoleOutputHandler{

    private static final long SPELL_DELAY = 15;
    private Object ConsoleOutputHandler;

    private void ConsoleOutputHandler(){
        //this class is intended to be static and not instanced.
    }
    
    /**
     * output the provided string in one line, character by character
     */

    public ConsoleOutputHandler newOutput(){
        ConsoleOutputHandler = new ConsoleOutputHandler();
        return this;

    }
    public ConsoleOutputHandler spell(String input) {
        for(int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
            try {
                TimeUnit.MILLISECONDS.sleep(SPELL_DELAY);
            }
            catch(InterruptedException e) {
                //if interrupted, clear the interrupt flag and continue
                Thread.currentThread().interrupt();
            }
        }
        return this;
    }
    /**
     * output the provided string in one line
     */
    public ConsoleOutputHandler post(String input) {
        System.out.println(input);
        return this;
    }
    /**
     * output a line break
     */ 
    public ConsoleOutputHandler lineBreak() {
        System.out.println();
        return this;
    }

    public void print(){
        try {
            finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}