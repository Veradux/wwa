package com.worldwarofants.game.arch.console;

import java.util.concurrent.TimeUnit;

public class ConsoleOutputHandler{

    private static final long SPELL_DELAY = 15;

    private void ConsoleOutputHandler(){
        //this class is intended to be static and not instanced.
    }
    
    /**
     * output the provided string in one line, character by character
     */
    public static void spell(String input) {
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
    }
    /**
     * output the provided string in one line
     */
    public static void post(String input) {
        System.out.println(input);   
    }
    /**
     * output a line break
     */ 
    public static void lineBreak() {
        System.out.println(); 
    }
    /**
     * Output the standard message to prompt the user for input
     */
    public static void promptInput() {
        post("Please enter your command:");
    }

    /**
    * Takes a TITLE string and uses spell to display it in the standard format
    */
    public static void spellTitle(String title) {
        String formattedTitle = "-- " + title + " --";
        spell(formattedTitle);
    }
    /**
    * Posts a command description and command in the standard format
    */
    public static void postCommand(String description, String command) {
         post(String.format("* %s - %s ", description, command));
    }
}
