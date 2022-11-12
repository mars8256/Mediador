
package components;

import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import mediator.IMediator;

/**
 *
 * @author pc-home
 */
public class TextBox extends JTextArea implements IComponent {
    
    private IMediator mediator;

    @Override
    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "TextBox";
    }
}
