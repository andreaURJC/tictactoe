package usantatecla.tictactoe.controllers;

import usantatecla.tictactoe.models.Coordinate;
import usantatecla.tictactoe.models.Session;
import usantatecla.tictactoe.types.Error;
import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.models.Token;

public class PlayController extends Controller {

	public PlayController(Session session) {
		super(session);
	}

	@Override
	public void accept(ControllerVisitor controller) {
		controller.visit(this);
	}

	public boolean isBoardComplete() {
		return this.session.game.isBoardComplete();
	}

	public boolean isTicTacToe() {
		return this.session.game.isTicTacToe();
	}

	public Token getToken() {
		return this.session.game.getToken();
	}

	public boolean isUser() {
		return this.session.game.isUser();
	}

	public Error put(Coordinate coordinate) {
		return this.session.game.put(coordinate);
	}

	public Error move(Coordinate origin, Coordinate target) {
		return this.session.game.move(origin, target);
	}

}
