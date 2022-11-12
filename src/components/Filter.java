
package components;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import mediator.IMediator;
import mediator.Note;

/**
 *
 * @author pc-home
 */
public class Filter extends JTextField implements IComponent {

    private IMediator mediator;
    private ListModel listModel;

    
    @Override
    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }
    
     @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        String start = getText();
        searchElements(start);
    }
    
    public void setList(ListModel listModel) {
        this.listModel = listModel;
    }
    
    private void searchElements(String s) {
        if (listModel == null) {
            return;
        }

        if (s.equals("")) {
            mediator.setElementsList(listModel);
            return;
        }

        ArrayList<Note> notes = new ArrayList<>();
        for (int i = 0; i < listModel.getSize(); i++) {
            notes.add((Note) listModel.getElementAt(i));
        }
        DefaultListModel<Note> listModel = new DefaultListModel<>();
        for (Note note : notes) {
            if (note.getName().toUpperCase().contains(s.toUpperCase())) {
                listModel.addElement(note);
            }
        }
        mediator.setElementsList(listModel);
    }

    @Override
    public String getName() {
        return "Filter";
    }
}
