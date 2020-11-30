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
		return this.session.isBoardComplete();
	}

	public boolean isTicTacToe() {
		return this.session.isTicTacToe();
	}

	public Token getToken() {
		return this.session.getToken();
	}

	public boolean isUser() {
		return this.session.isUser();
	}

	public Error put(Coordinate coordinate) {
		return this.session.put(coordinate);
	}

	public Error move(Coordinate origin, Coordinate target) {
		return this.session.move(origin, target);
	}

}
