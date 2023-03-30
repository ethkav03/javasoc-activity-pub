/**
  * @author kavane39
  * @since 29/03/2023

The Outbox interface provides functionality for sending and delivering messages.
@see ClientOutbox
*/
public interface Outbox extends SendMessage, DeliverNextMessage {

/**
    @return the count of unsent messages in the outbox.
    */
    int getCount();
}