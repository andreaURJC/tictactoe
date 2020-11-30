package usantatecla.tictactoe.controllers;

import usantatecla.tictactoe.models.Session;

public class ResumeController extends Controller {

  public ResumeController(Session session) {
    super(session);
  }

  public void resume() {
    this.session.game.reset();
  }

}
