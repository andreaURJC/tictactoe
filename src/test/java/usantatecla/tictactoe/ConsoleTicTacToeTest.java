package usantatecla.tictactoe;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import usantatecla.tictactoe.controllers.Controller;
import usantatecla.tictactoe.controllers.Logic;
import usantatecla.tictactoe.controllers.PlayController;
import usantatecla.tictactoe.objectfactory.ControllerFactory;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class ConsoleTicTacToeTest2 {
    private ConsoleTicTacToe ticTacToe;

    private ControllerFactory controllerFactory;
    @Mock
    private Logic logic;

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
        verify(this.logic.getController(), times(1));
    }

    private Controller startController() {
        return this.controllerFactory.getStartController();
    }
}
