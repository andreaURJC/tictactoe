package usantatecla.tictactoe.views;

import usantatecla.tictactoe.controllers.Controller;

public abstract class View {

    public void interact(Controller controller) {
        do {
            this.start();
            this.play();
        } while (this.isResumed());
    }

    protected abstract void start();
    protected abstract void play();
    protected abstract boolean isResumed();

    public abstract void visit(Controller startController);
}
