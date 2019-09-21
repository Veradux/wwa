package com.worldwarofants.game.module.startmenu;

import com.worldwarofants.game.arch.AbstractView;
import com.worldwarofants.game.arch.console.ConsoleOutputHandler;

public class StartMenuView extends AbstractView<StartMenuViewModel> {

	public StartMenuView(StartMenuViewModel viewModel) {
		super(viewModel);
	}
	
	public void renderStartMenuScreen() {
		final String NEW_GAME_DESC = "New Game";
		final String EXIT_DESC = "Exit";
		final String TITLE = "WORLD WAR OF ANTS";
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.spellTitle(TITLE);
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.postCommand(NEW_GAME_DESC, StartMenuCommandHandler.COMMAND_NEW_GAME);
		ConsoleOutputHandler.postCommand(EXIT_DESC, StartMenuCommandHandler.COMMAND_EXIT_GAME);
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.promptInput();
	}
}
