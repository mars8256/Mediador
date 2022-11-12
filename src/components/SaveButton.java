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
public class SaveButton extends JButton implements IComponent {

    private IMediator mediator;
    
    public SaveButton() {
        super("Save");
    }
    
    @Override
    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }
    
     @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }
    
}
