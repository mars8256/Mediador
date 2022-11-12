
package edu.uspg;

import components.*;
import javax.swing.DefaultListModel;
import mediator.Editor;
import mediator.IMediator;

/**
 *
 * @author pc-home
 */
public class MediadorPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       IMediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
    
}
