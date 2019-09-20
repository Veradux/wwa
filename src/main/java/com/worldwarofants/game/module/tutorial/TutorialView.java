package com.worldwarofants.game.module.tutorial;

import com.worldwarofants.game.arch.AbstractView;
import com.worldwarofants.game.arch.console.ConsoleOutputHandler;

public class TutorialView extends AbstractView<TutorialViewModel> {

	private final String START_MESSAGE = "Your colony is under attack! You are on the brink of defeat and you must fall back in order to avoid complete annihilation! ...";
	private final String FIGHT_MESSAGE = "Your entire colony has been overrun and annihilated; a colony with such a low POPULATION is no match for an enemy of this size!";
	private final String RETREAT_MESSAGE = "You made the right decision!";
	
	public TutorialView(TutorialViewModel viewModel) {
		super(viewModel);
	}

	public void renderTutorialScreenStart() {
		String fightPrompt = String.format("* Fight! - %s ", TutorialCommandHandler.COMMAND_FIGHT);
		String retreatPrompt = String.format("* Retreat! - %s ", TutorialCommandHandler.COMMAND_RETREAT);
		String quitPrompt = String.format("* Quit! - %s ", TutorialCommandHandler.COMMAND_QUIT);
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.spell(START_MESSAGE);
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.post(fightPrompt);
		ConsoleOutputHandler.post(retreatPrompt);
		ConsoleOutputHandler.post(quitPrompt);
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.post("Please enter your command:");
	}

	public void renderTutorialScreenFight() {
		ConsoleOutputHandler.spell(FIGHT_MESSAGE);
	}

	public void renderTutorialScreenRetreat() {
		//TODO this is currently a dead end
		ConsoleOutputHandler.spell(RETREAT_MESSAGE);
	}
}
