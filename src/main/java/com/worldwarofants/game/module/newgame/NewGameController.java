package com.worldwarofants.game.module.newgame;

import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.module.ModuleName;

public class NewGameController extends AbstractController<NewGameView> {

	public NewGameController(NewGameView view, IModuleNavigator navigator) {
		super(view, navigator);
	}

	public void showNewGameScreen() {
		view.renderNewGameScreen();
	}
	
	public void startNewGame() {
		String[] args = new String[0];
		navigateTo(ModuleName.TUTORIAL, args);
	}

	public void back(){
		String[] args = new String[0];
		navigateTo(ModuleName.START_MENU, args);
	}
}
