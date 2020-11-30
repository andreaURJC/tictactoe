package usantatecla.tictactoe;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import usantatecla.tictactoe.controllers.Controller;
import usantatecla.tictactoe.controllers.Logic;
import usantatecla.tictactoe.objectfactory.ControllerFactory;
import usantatecla.tictactoe.views.console.View;

import static org.mockito.Mockito.*;

public class ConsoleTicTacToeTest {
    private ConsoleTicTacToe ticTacToe;

    private ControllerFactory controllerFactory;

    @Mock
    private Logic logic;

    @Mock
    private View view;

    @Before
    public void before() {
        MockitoAnnotations.openMocks(this);
        this.ticTacToe = new ConsoleTicTacToe(logic);
        this.controllerFactory = new ControllerFactory();
    }

    @Test
    public void testPlayShouldGetControllerFromLogicAndInteractWithTheView() {
        this.ticTacToe.play();
        when(this.logic.getController()).thenReturn(startController());

        verify(this.logic, times(1)).getController();
        verify(this.view,times(1)).interact(any());
    }

    @Test
    public void testPlayShouldGetControllerFromLogicAndInteractWithTheViewUntilControllerIsNull() {
        this.ticTacToe.play();
        when(this.logic.getController()).thenReturn(startController());

        verify(this.logic, times(1)).getController();
        verify(this.view,times(1)).interact(any());

        when(this.logic.getController()).thenReturn(playController());

        verify(this.logic, times(1)).getController();
        verify(this.view,times(1)).interact(any());

        when(this.logic.getController()).thenReturn(null);
        verify(this.logic, times(1)).getController();
        verify(this.view,times(0)).interact(any());

        verifyNoInteractions(this.logic, this.view);
    }

    private Controller playController() {
        return this.controllerFactory.getPlayController();
    }

    private Controller startController() {
        return this.controllerFactory.getStartController();
    }
}
