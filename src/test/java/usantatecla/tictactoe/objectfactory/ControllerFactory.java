package usantatecla.tictactoe.objectfactory;

import usantatecla.tictactoe.controllers.PlayController;
import usantatecla.tictactoe.controllers.ResumeController;
import usantatecla.tictactoe.controllers.StartController;
import usantatecla.tictactoe.models.Session;

public class ControllerFactory {

    private Session session = new Session();

    public PlayController getPlayController() {
        return new PlayController(session);
    }

    public ResumeController getResumeController() {
        return new ResumeController(session);
    }

    public StartController getStartController() {
        return new StartController(session);
    }
}
