
package components;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import mediator.IMediator;
import mediator.Note;

/**
 *
 * @author pc-home
 */
public class AddButton extends JButton implements IComponent {

    private IMediator mediator;
    
    public AddButton() {
        super("Add");
    }
    
    @Override
    public void setMediator(IMediator mediator) {
       this.mediator = mediator;
    }   
    
    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }
    
    @Override
    public String getName() {
        return "AddButton";
    }
    
}
