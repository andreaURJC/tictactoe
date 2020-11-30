package usantatecla.tictactoe.views.console;

import usantatecla.tictactoe.controllers.*;

public class View extends usantatecla.tictactoe.views.View implements ControllerVisitor {

    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public View(StartController startController, PlayController playController, ResumeController resumeController) {
        this.startView = new StartView(startController);
        this.playView = new PlayView(playController);
        this.resumeView = new ResumeView(resumeController);
    }

    @Override
    public void interact(Controller controller) {
        controller.accept(this);
    }

    @Override
    public void visit(StartController startController) { this.startView.interact(); }

    @Override
    public void visit(PlayController playController) {
        this.playView.interact();
    }

    @Override
    public void visit(ResumeController resumeController) {
        this.resumeView.interact();
    }

}
