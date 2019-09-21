package com.worldwarofants.game.module.newgame;

import com.worldwarofants.game.arch.AbstractView;
import com.worldwarofants.game.arch.console.ConsoleOutputHandler;

public class NewGameView extends AbstractView<NewGameViewModel> {

	public NewGameView(NewGameViewModel viewModel) {
		super(viewModel);
	}

	public void renderNewGameScreen() {
		String startGamePrompt = String.format("* Start Game - %s ", NewGameCommandHandler.COMMAND_START_NEW_GAME);
		String backPrompt = String.format("* Back - %s ", NewGameCommandHandler.COMMAND_BACK);

		ConsoleOutputHandler console = new ConsoleOutputHandler();
		console.newOutput()
		.lineBreak()
		.spell("-- GAME SETUP --")
		.lineBreak()
		.post(startGamePrompt)
		.post(backPrompt)
		.lineBreak()
		.post("Please enter your command:")
		.print();
	}
}
