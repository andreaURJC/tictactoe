package usantatecla.tictactoe;

import usantatecla.tictactoe.controllers.*;
import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.views.console.View;


public abstract class TicTacToe {

    private Game game;
    private StartController startController;
    private PlayController playController;
    private ResumeController resumeController;
    private View view;
    private Logic logic;

    protected TicTacToe(Logic logic) {
        this.logic = new Logic();
        this.game = new Game();
        this.startController = new StartController(this.game);
        this.playController = new PlayController(this.game);
        this.resumeController = new ResumeController(this.game);
        this.view = this.createView(this.startController, this.playController, this.resumeController);
    }

    protected abstract View createView(StartController startController, PlayController playController, ResumeController resumeController2);

    protected void play() {
        Controller controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                this.view.interact();
            }
        } while (controller != null);
        this.view.interact();
    }
}
