package com.worldwarofants.game.module.tutorial;

import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.module.ModuleName;

public class TutorialController extends AbstractController<TutorialView> {

	public TutorialController(TutorialView view, IModuleNavigator navigator) {
		super(view, navigator);
	}

	public void showTutorialScreenStart() {
		view.renderTutorialScreenStart();
	}

	public void fight(){
		view.renderTutorialScreenFight();
		//since this is game-over, return to the start screen
		quit();
	}

	public void retreat(){
		view.renderTutorialScreenRetreat();
	}

	//return to main menu
	public void quit(){
		String[] args = new String[0];
		navigateTo(ModuleName.START_MENU, args);
	}

}
