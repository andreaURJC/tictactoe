package usantatecla.tictactoe.controllers;

import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.models.Session;

public class StartController extends Controller {

  public StartController(Session session) {
    super(session);
  }

  public void setUsers(int users) {
    this.session.game.setUsers(users);
  }

  public int getMaxPlayers() {
	return this.session.game.getMaxPlayers();
}

}
