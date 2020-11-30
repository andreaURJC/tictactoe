package usantatecla.tictactoe.models;

import usantatecla.tictactoe.types.StateValue;

public class State {
    private StateValue stateValue;

    public State() {
        this.stateValue = StateValue.INITIAL;
    }

    public StateValue getStateValue() {
        return this.stateValue;
    }
}
