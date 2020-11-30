package usantatecla.tictactoe;

import usantatecla.tictactoe.controllers.*;
import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.views.console.View;


public abstract class TicTacToe {

    private View view;
    protected Logic logic;

    protected TicTacToe() {
        this.logic = new Logic( new Game());
        this.view = this.createView(this.logic);
    }

    protected abstract View createView(Logic logic);

    protected void play() {
        Controller controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                this.view.interact(controller);
            }
        } while (controller != null);
    }
}
