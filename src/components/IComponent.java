
package components;

import mediator.IMediator;

/**
 *
 * @author pc-home
 */
public interface IComponent {
     void setMediator(IMediator mediator);
    String getName();
}
