package usantatecla.tictactoe.views.console;

import jdk.javadoc.internal.tool.Start;
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

    public void interact(Controller controller) {
        if(controller instanceof StartController) {
            this.visit((StartController) controller);
        } else if(controller instanceof PlayController) {
            this.visit((PlayController) controller);
        } else if(controller instanceof ResumeController){
            this.visit((ResumeController) controller);
        }
    }

    @Override
    public void visit(StartController startController) {
        this.startView.interact();
    }

    @Override
    public void visit(PlayController playController) {
        this.playView.interact();
    }

    @Override
    public void visit(ResumeController resumeController) {
        this.resumeView.interact();
    }

}
