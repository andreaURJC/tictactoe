package usantatecla.tictactoe.models;

import usantatecla.tictactoe.types.StateValue;

public class Session {
    private State state;

    public Session() {
        this.state = new State();
    }

    public StateValue getStateValue() {
        return this.state.getStateValue();
    }
}
