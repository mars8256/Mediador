/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import mediator.IMediator;

/**
 *
 * @author pc-home
 */
public class DeleteButton extends JButton  implements IComponent {

    private IMediator mediator;
    
    public DeleteButton() {
        super("Del");
    }
    
    @Override
    public void setMediator(IMediator mediator) {
       this.mediator = mediator;
    }
    
    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }
    
}
