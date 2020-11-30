package usantatecla.tictactoe;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import usantatecla.tictactoe.controllers.Logic;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.openMocks;

class TicTacToeTest {

    @InjectMocks
    private ConsoleTicTacToe ticTacToe;

    @Mock
    private Logic logic;

    @Before
    public void before() {
        openMocks(this);
    }
    @Test
    public void testPlayShouldGetControllerFromLogicAndInteractWithTheView() {
        this.ticTacToe.play();
        verify(this.logic.getController(), times(1));
    }
}