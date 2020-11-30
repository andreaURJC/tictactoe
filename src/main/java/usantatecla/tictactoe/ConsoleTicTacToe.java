package usantatecla.tictactoe;

import usantatecla.tictactoe.controllers.Logic;
import usantatecla.tictactoe.controllers.PlayController;
import usantatecla.tictactoe.controllers.ResumeController;
import usantatecla.tictactoe.controllers.StartController;
import usantatecla.tictactoe.types.StateValue;
import usantatecla.tictactoe.views.console.View;

class ConsoleTicTacToe extends TicTacToe {

    protected ConsoleTicTacToe() {
        super();
    }

    public static void main(String[] args) {
        new ConsoleTicTacToe().play();
    }

    @Override
    protected View createView(Logic logic) {
        return new View((StartController) this.logic.getController(StateValue.INITIAL),
                (PlayController) this.logic.getController(StateValue.IN_GAME),
                (ResumeController) this.logic.getController(StateValue.RESUME));
    }
}
