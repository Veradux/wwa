package com.worldwarofants.game.module.startmenu;

import com.worldwarofants.game.arch.AbstractView;
import com.worldwarofants.game.arch.console.ConsoleOutputHandler;

public class StartMenuView extends AbstractView<StartMenuViewModel> {

	public StartMenuView(StartMenuViewModel viewModel) {
		super(viewModel);
	}
	
	public void renderStartMenuScreen() {
		String newGamePrompt = String.format("* New Game - %s ", StartMenuCommandHandler.COMMAND_NEW_GAME);
		String exitPrompt = String.format("* Exit - %s ", StartMenuCommandHandler.COMMAND_EXIT_GAME);

		ConsoleOutputHandler console = new ConsoleOutputHandler();
		console.newOutput()
		.lineBreak()
		.spell("-- WORLD WAR OF ANTS --")
		.lineBreak()
		.post(newGamePrompt)
		.post(exitPrompt)
		.lineBreak()
		.post("Please enter your command:")
		.print();
	}
}
