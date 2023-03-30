/**
  * @author kavane39
  * @since 29/03/2023

  The ReceiveMessage interface provides functionality for receiving messages and adding them to the Inbox.
  @see ClientInbox
*/
public interface ReceiveMessage {
/**
    Receives a message and adds it to the Inbox.
    @param activity the activity to be received and added to the Inbox.
    @return true if the message was received successfully and added to the Inbox, false otherwise.
    */
    boolean receive(Activity activity);
}

