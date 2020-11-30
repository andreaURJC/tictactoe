package usantatecla.tictactoe.views.console;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import usantatecla.tictactoe.controllers.Controller;
import usantatecla.tictactoe.objectfactory.ControllerFactory;

import static org.junit.Assert.*;

public class ViewTest {

    @InjectMocks
    private View view;

    @Mock
    private StartView startView;

    @Mock
    private PlayView playView;

    @Mock
    private ResumeView resumeView;

    private ControllerFactory controllerFactory;

    @Before
    public void before() {
        this.controllerFactory = new ControllerFactory();
    }

    @Test
    public void viewInteractWithStartControllerShouldInteractWithStartView() {
        Controller startController = this.controllerFactory.getStartController();
        this.view.interact(startController);
    }

}