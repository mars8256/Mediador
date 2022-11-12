
package mediator;

import components.IComponent;
import javax.swing.ListModel;


/**
 *
 * @author pc-home
 */
public interface IMediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel list);
    void registerComponent(IComponent component);
    void hideElements(boolean flag);
    void createGUI();
}
