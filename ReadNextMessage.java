/**
  * @author kavane39
  * @since 29/03/2023

  The ReadNextMessage interface provides functionality for removing and retrieving the next message from the Inbox.
  @see ClientInbox
*/
public interface ReadNextMessage {
/**
    Removes and retrieves the next message from the Inbox.
    @return the next activity in the Inbox, or null if there are no messages.
    */
    Activity readNext();
}