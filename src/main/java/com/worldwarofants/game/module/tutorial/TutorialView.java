package com.worldwarofants.game.module.tutorial;

import com.worldwarofants.game.arch.AbstractView;
import com.worldwarofants.game.arch.console.ConsoleOutputHandler;

public class TutorialView extends AbstractView<TutorialViewModel> {

	private static final String START_MESSAGE = "Your colony is under attack! You are on the brink of defeat and you must fall back in order to avoid complete annihilation! ...";
	private static final String FIGHT_MESSAGE = "Your entire colony has been overrun and annihilated; a colony with such a low POPULATION is no match for an enemy of this size!";
	private static final String RETREAT_MESSAGE = "You made the right decision!";
	private static final String FIGHT_DESC = "Fight";
	private static final String RETREAT_DESC = "Retreat";
	private static final String QUIT_DESC = "Quit";
	
	public TutorialView(TutorialViewModel viewModel) {
		super(viewModel);
	}

	public void renderTutorialScreenStart() {
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.spell(START_MESSAGE);
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.postCommand(FIGHT_DESC, TutorialCommandHandler.COMMAND_FIGHT);
		ConsoleOutputHandler.postCommand(RETREAT_DESC, TutorialCommandHandler.COMMAND_RETREAT);
		ConsoleOutputHandler.postCommand(QUIT_DESC, TutorialCommandHandler.COMMAND_QUIT);
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.promptInput();
	}

	public void renderTutorialScreenFight() {
		//TODO this ends the game.
		ConsoleOutputHandler.spell(FIGHT_MESSAGE);
	}

	public void renderTutorialScreenRetreat() {
		//TODO this is currently a dead end
		ConsoleOutputHandler.spell(RETREAT_MESSAGE);
	}
}
