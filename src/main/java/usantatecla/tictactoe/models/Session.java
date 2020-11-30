package usantatecla.tictactoe.models;

import usantatecla.tictactoe.types.Error;
import usantatecla.tictactoe.types.StateValue;

public class Session {
    private State state;
    private Game game;

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

    public boolean isBoardComplete() {
        return this.game.isBoardComplete();
    }

    public boolean isTicTacToe() {
        return this.game.isTicTacToe();
    }

    public Token getToken() {
        return this.game.getToken();
    }

    public boolean isUser() {
        return this.game.isUser();
    }

    public Error put(Coordinate coordinate) {
        return this.game.put(coordinate);
    }

    public Error move(Coordinate origin, Coordinate target) {
        return this.game.move(origin, target);
    }

    public void resume() {
        this.game.reset();
    }

    public void setUsers(int users) {
        this.game.setUsers(users);
    }

    public int getMaxPlayers() {
        return this.game.getMaxPlayers();
    }

}
