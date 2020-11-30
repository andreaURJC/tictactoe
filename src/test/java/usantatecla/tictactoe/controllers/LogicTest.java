package usantatecla.tictactoe.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import usantatecla.tictactoe.models.Session;
import usantatecla.tictactoe.objectfactory.ControllerFactory;
import usantatecla.tictactoe.types.StateValue;

import java.util.Map;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class LogicTest {

    @InjectMocks
    private Logic logic;

    @Mock
    private Session session;

    private ControllerFactory controllerFactory = new ControllerFactory();

    @Test
    public void testGetControllerWhenStateValueIsInitialShouldReturnStartController() {
        Mockito.when(this.session.getStateValue()).thenReturn(StateValue.INITIAL);

        assertThat(this.logic.getController(), is(instanceOf(StartController.class)));
    }

    @Test
    public void testGetControllerWhenStateValueIsInGameShouldReturnPlayController() {
        Mockito.when(this.session.getStateValue()).thenReturn(StateValue.IN_GAME);

        assertThat(this.logic.getController(), is(instanceOf(PlayController.class)));
    }

    @Test
    public void testGetControllerWhenStateValueIsResumeShouldReturnResumeController() {
        Mockito.when(this.session.getStateValue()).thenReturn(StateValue.RESUME);

        assertThat(this.logic.getController(), is(instanceOf(ResumeController.class)));
    }
}