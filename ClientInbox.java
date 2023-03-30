/**
  * @author kavane39
  * @since 29/03/2023
  */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
ClientInbox implements Inbox, RecieveMessage, ReadNextMessage.
@see Inbox
*/
public class ClientInbox implements Inbox {
    private List<Activity> messages;

    /**
    Constructor for ClientInbox
     */
    ClientInbox () {
        messages = new ArrayList<>();
    }

    /**
    @return the count of unread messages in the inbox.
    */
    public int getCount () {
        return messages.size();
    }

    /**
    Removes and retrieves the next message from the Inbox.
    @return the next activity in the Inbox, or null if there are no messages.
    */
    public Activity readNext () {
        return (this.getCount() > 0) ? messages.remove(0) : null;
    }

    /**
    Receives a message and adds it to the Inbox.
    @param activity the activity to be received and added to the Inbox.
    @return true if the message was received successfully and added to the Inbox, false otherwise.
    */
    public boolean receive(Activity activity) {
        return this.messages.add(activity);
    }

    /**
    toString method for ClientInbox
    @return String list of Inbox contents
     */
    public String toString () {
        if (this.getCount() > 0) {
            String result = messages.stream()
            .map(Activity::getURI)
            .collect(Collectors.joining("\n-"));
            return "- " + result;
        }
        return "- Inbox is empty";
    }
}
