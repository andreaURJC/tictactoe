package usantatecla.tictactoe;

import usantatecla.tictactoe.controllers.Logic;
import usantatecla.tictactoe.controllers.PlayController;
import usantatecla.tictactoe.controllers.ResumeController;
import usantatecla.tictactoe.controllers.StartController;
import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.views.console.View;

class ConsoleTicTacToe extends TicTacToe {

	protected ConsoleTicTacToe() {
		super(new Logic(new Game()));
	}

	public static void main(String[] args) {
		new ConsoleTicTacToe().play();
	}

	@Override
	protected View createView(StartController startController, PlayController playController, ResumeController resumeController){
		return new View(startController, playController, resumeController);
	}
}
