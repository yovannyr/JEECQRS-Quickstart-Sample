package org.jeeventstore.example.quickstart.sagas.orders;

import org.jeecqrs.common.event.Event;
import org.jeecqrs.integration.jcommondomain.sagas.AbstractSingleEventSaga;
import org.jeecqrs.sagas.Saga;
import org.jeeventstore.example.quickstart.domain.model.order.OrderId;
import org.jeeventstore.example.quickstart.internal.NotifyCustomerCommand;

public abstract class AbstractMessagingSaga<S extends Saga<Event>, F extends Event>
        extends AbstractSingleEventSaga<S, F> {

    protected void sendCustomerMessage(OrderId orderId, String msg) {
        NotifyCustomerCommand cmd = new NotifyCustomerCommand(orderId, msg);
        this.executeCommand(cmd);
    }

}
