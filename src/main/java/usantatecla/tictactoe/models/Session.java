package usantatecla.tictactoe.models;

import usantatecla.tictactoe.types.StateValue;

public class Session {
    private State state;
    public Game game;

    public Session() {
        this.state = new State();
        this.game = new Game();
    }

    public StateValue getStateValue() {
        return this.state.getStateValue();
    }

    public Token getToken(Coordinate coordinate) {
        return this.game.getToken(coordinate);
    }

    public Game getGame() {
        return this.game;
    }
}
