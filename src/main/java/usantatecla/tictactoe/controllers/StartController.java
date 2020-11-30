package usantatecla.tictactoe.controllers;

import usantatecla.tictactoe.models.Session;

public class StartController extends Controller {

  public StartController(Session session) {
    super(session);
  }

  public void setUsers(int users) {
    this.session.setUsers(users);
  }

  public int getMaxPlayers() {
	return this.session.getMaxPlayers();
}

  @Override
  public void accept(ControllerVisitor controller) {
    controller.visit(this);
  }
}
