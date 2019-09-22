package com.worldwarofants.game.module.startmenu;

import com.worldwarofants.game.arch.AbstractView;
import com.worldwarofants.game.arch.console.ConsoleOutputHandler;

public class StartMenuView extends AbstractView<StartMenuViewModel> {

	private static final String NEW_GAME_DESC = "New Game";
	private static final String EXIT_DESC = "Exit";
	private static final String TITLE = "WORLD WAR OF ANTS";
	
	public StartMenuView(StartMenuViewModel viewModel) {
		super(viewModel);
	}
	
	public void renderStartMenuScreen() {
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.spellTitle(TITLE);
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.postCommand(NEW_GAME_DESC, StartMenuCommandHandler.COMMAND_NEW_GAME);
		ConsoleOutputHandler.postCommand(EXIT_DESC, StartMenuCommandHandler.COMMAND_EXIT_GAME);
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.promptInput();
	}
}
