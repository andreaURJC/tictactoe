package usantatecla.tictactoe.controllers;

import usantatecla.tictactoe.models.Game;
import usantatecla.tictactoe.models.Session;
import usantatecla.tictactoe.types.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {
    private Session session;
    private Map<StateValue, Controller> controllers;

    public Logic(Game game) {
        this.session = new Session();
        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.INITIAL, new StartController(session));
        this.controllers.put(StateValue.IN_GAME, new PlayController(session));
        this.controllers.put(StateValue.RESUME, new ResumeController(session));
        this.controllers.put(StateValue.EXIT, null);
    }

    public Controller getController() {
        return this.controllers.get(this.session.getStateValue());
    }

    public Controller getController(StateValue stateValue) {
        return this.controllers.get(stateValue);
    }
}
