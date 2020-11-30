package usantatecla.tictactoe.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import usantatecla.tictactoe.models.Session;
import usantatecla.tictactoe.objectfactory.ControllerFactory;
import usantatecla.tictactoe.types.StateValue;

import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@ExtendWith(MockitoExtension.class)
public class LogicTest {

    @InjectMocks
    private Logic logic;

    @Mock
    private Session session;

    @Mock
    private Map<StateValue,Controller> controllers;

    private ControllerFactory controllerFactory = new ControllerFactory();

//    @Before
//    public void before() {
//
//    }

    @Test
    public void testGetControllerAtSessionState() {
        Mockito.when(this.session.getStateValue()).thenReturn(StateValue.INITIAL);
        assertThat(this.logic.getController(), is(controllerFactory.getStartController()));
    }
}