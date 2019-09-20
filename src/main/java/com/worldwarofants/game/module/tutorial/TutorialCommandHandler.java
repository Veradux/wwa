package com.worldwarofants.game.module.tutorial;

import java.util.Map;
import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.arch.console.command.ICommand;
import com.worldwarofants.game.module.ModuleName;

public class TutorialCommandHandler extends AbstractCommandHandler<TutorialController> {
	
	public static final String COMMAND_SHOW_TUTORIAL_SCREEN_START = "show";
	public static final String COMMAND_CONTINUE = "fight";
	public static final String COMMAND_FALLBACK = "retreat";
	public static final String COMMAND_QUIT = "quit";

	public TutorialCommandHandler(TutorialController controller) {
		super(controller);
	}

	@Override
	protected void defineCommands(Map<String, ICommand<TutorialController>> commands) {
		commands.put(COMMAND_SHOW_TUTORIAL_SCREEN_START, (controller, args) -> controller.showTutorialScreenStart());
		commands.put(COMMAND_CONTINUE, (controller, args) -> controller.continueTheFight());
		commands.put(COMMAND_FALLBACK, (controller, args) -> controller.retreat());
		commands.put(COMMAND_QUIT, (controller, args) -> controller.quit());
	}

	@Override
	public void executeStartingCommand(String[] arguments) {
		executeCommand(COMMAND_SHOW_TUTORIAL_SCREEN_START);
	}
}
