package usantatecla.tictactoe.views.console;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import usantatecla.tictactoe.controllers.Controller;
import usantatecla.tictactoe.controllers.PlayController;
import usantatecla.tictactoe.controllers.ResumeController;
import usantatecla.tictactoe.controllers.StartController;
import usantatecla.tictactoe.objectfactory.ControllerFactory;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

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
        StartController startController = this.controllerFactory.getStartController();
        this.view.interact(startController);
        verify(this.view, times(1)).visit(startController);
    }

    @Test
    public void viewInteractWithPlayControllerControllerShouldInteractWithPlayView() {
        PlayController playController = this.controllerFactory.getPlayController();
        this.view.interact(playController);
        verify(this.view, times(1)).visit(playController);
    }

    @Test
    public void viewInteractWithResumeControllerControllerShouldInteractWithResumeView() {
        ResumeController resumeController = this.controllerFactory.getResumeController();
        this.view.interact(resumeController);
        verify(this.view, times(1)).visit(resumeController);
    }

}