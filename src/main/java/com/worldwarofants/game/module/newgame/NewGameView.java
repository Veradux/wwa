package com.worldwarofants.game.module.newgame;

import com.worldwarofants.game.arch.AbstractView;
import com.worldwarofants.game.arch.console.ConsoleOutputHandler;

public class NewGameView extends AbstractView<NewGameViewModel> {

	private static final String START_GAME_DESC = "Start Game";
	private static final String BACK_DESC = "Back";
	private static final String TITLE = "GAME SETUP";
	
	public NewGameView(NewGameViewModel viewModel) {
		super(viewModel);
	}

	public void renderNewGameScreen() {
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.spellTitle(TITLE);
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.postCommand(START_GAME_DESC, NewGameCommandHandler.COMMAND_START_NEW_GAME);
		ConsoleOutputHandler.postCommand(BACK_DESC, NewGameCommandHandler.COMMAND_BACK);
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.promptInput();
	}
}
