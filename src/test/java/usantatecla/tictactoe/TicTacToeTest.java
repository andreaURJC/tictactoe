package usantatecla.tictactoe;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import usantatecla.tictactoe.controllers.Logic;
import usantatecla.tictactoe.views.View;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class TicTacToeTest {

    @InjectMocks
    private TicTacToe ticTacToe = new ConsoleTicTacToe();

    @Mock
    private View view;

    @Mock
    private Logic logic;

    @Before
    public void before() {

    }
    @Test
    public void testPlayShouldGetcontrollerFromLogicAndInteractWithTheView() {
        verify(this.logic.getController(), times(1));

    }
}