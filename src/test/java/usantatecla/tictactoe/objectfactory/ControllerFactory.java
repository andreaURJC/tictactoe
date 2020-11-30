package usantatecla.tictactoe.objectfactory;

import usantatecla.tictactoe.controllers.PlayController;
import usantatecla.tictactoe.controllers.ResumeController;
import usantatecla.tictactoe.controllers.StartController;
import usantatecla.tictactoe.models.Game;

public class ControllerFactory {

    private Game game = new Game();

    public PlayController getPlayController() {
        return new PlayController(this.game);
    }

    public ResumeController getResumeController() {
        return new ResumeController(this.game);
    }

    public StartController getStartController() {
        return new StartController(this.game);
    }
}
