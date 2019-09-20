package com.worldwarofants.game.module.tutorial;

import com.worldwarofants.game.arch.AbstractView;
import com.worldwarofants.game.arch.console.ConsoleOutputHandler;

public class TutorialView extends AbstractView<TutorialViewModel> {

	public TutorialView(TutorialViewModel viewModel) {
		super(viewModel);
	}

	public void renderTutorialScreenStart() {
		String fightPrompt = String.format("* Fight! - %s ", TutorialCommandHandler.COMMAND_FIGHT);
		String retreatPrompt = String.format("* Retreat! - %s ", TutorialCommandHandler.COMMAND_RETREAT);
		String quitPrompt = String.format("* Retreat! - %s ", TutorialCommandHandler.COMMAND_QUIT);
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.spell("Your colony is under attack! You are on the brink of defeat and you must fall back in order to avoid complete annihilation! ...");
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.post(fightPrompt);
		ConsoleOutputHandler.post(retreatPrompt);
		ConsoleOutputHandler.post(quitPrompt);
		ConsoleOutputHandler.lineBreak();;
		ConsoleOutputHandler.post("Please enter your command:");
	}

	public void renderTutorialScreenFight() {
		ConsoleOutputHandler.spell("Your entire colony has been overrun and annihilated; a colony with such a low POPULATION is no match for an enemy of this size!");
	}

	public void renderTutorialScreenRetreat() {
		//TO-DO this is currently a dead end
		ConsoleOutputHandler.spell("You made the right decision!");
	}
}
