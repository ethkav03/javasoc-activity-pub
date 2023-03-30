/**
  * @author kavane39
  * @since 29/03/2023

  The SendMessage interface provides functionality for sending messages and adding them to the Outbox.
  @see ClientOutbox
*/
public interface SendMessage {
/**
    Sends a message and adds it to the Outbox.
    @param activity the activity to be sent and added to the Outbox.
    @return true if the message was sent successfully and added to the Outbox, false otherwise.
    */
    boolean send(Activity activity);
}