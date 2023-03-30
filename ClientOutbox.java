/**
  * @author kavane39
  * @since 29/03/2023
  */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
ClientOutbox implements the interface Outbox, DeliverNextMessage, SendMessage.
@see ClientOutbox
*/
public class ClientOutbox implements Outbox {
    private List<Activity> messages;

    /**
    Constructor for ClientOutbox
     */
    ClientOutbox () {
        messages = new ArrayList<>();
    }

    /**
    @return the count of unsent messages in the outbox.
    */
    public int getCount () {
        return messages.size();
    }

    /**
    Sends a message and adds it to the Outbox.
    @param activity the activity to be sent and added to the Outbox.
    @return true if the message was sent successfully and added to the Outbox, false otherwise.
    */
    public boolean send (Activity activity) {
        return messages.add(activity);
    }

    /**
    Removes and delivers the next message from the Inbox.
    @return the next activity in the Inbox, or null if there are no messages.
    */
    public Activity deliverNext () {
        return (this.getCount() > 0) ? messages.remove(0) : null;
    }

    /**
    toString method for ClientOutbox
    @return String list of outbox contents
     */
    public String toString () {
        if (this.getCount() > 0) {
            String result = messages.stream()
            .map(Activity::getURI)
            .collect(Collectors.joining("\n- "));
            return "- " + result;
        }
        return "- Outbox is empty";
    }
}
