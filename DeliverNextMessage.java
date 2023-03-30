/**
  * @author kavane39
  * @since 29/03/2023

    The DeliverNextMessage interface provides functionality for removing and delivering the next message from the Inbox.
    @see ClientInbox
*/
public interface DeliverNextMessage {
/**
    Removes and delivers the next message from the Inbox.
    @return the next activity in the Inbox, or null if there are no messages.
    */
    Activity deliverNext();
}