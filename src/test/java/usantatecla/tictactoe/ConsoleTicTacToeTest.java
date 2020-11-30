package usantatecla.tictactoe;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import usantatecla.tictactoe.controllers.Controller;
import usantatecla.tictactoe.controllers.Logic;
import usantatecla.tictactoe.objectfactory.ControllerFactory;
import usantatecla.tictactoe.views.console.View;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ConsoleTicTacToeTest {

    @InjectMocks
    private ConsoleTicTacToe ticTacToe;

    private ControllerFactory controllerFactory = new ControllerFactory();

    @Mock
    private Logic logic;

    @Mock
    private View view;

    @Before
    public void before() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testPlayShouldGetControllerFromLogicAndInteractWithTheView() {
        when(this.logic.getController()).thenReturn(startController(), null);
        this.ticTacToe.play();

        verify(this.logic, times(2)).getController();
        verify(this.view, times(1)).interact(any());
    }

    @Test
    public void testPlayShouldGetControllerFromLogicAndInteractWithTheViewUntilControllerIsNull() {
        when(this.logic.getController()).thenReturn(startController(), playController(), resumeController(), null);
        this.ticTacToe.play();

        verify(this.logic, times(4)).getController();
        verify(this.view, times(3)).interact(any());
    }

    private Controller resumeController() {
        return this.controllerFactory.getResumeController();
    }

    private Controller playController() {
        return this.controllerFactory.getPlayController();
    }

    private Controller startController() {
        return this.controllerFactory.getStartController();
    }
}
