/**
  * @author kavane39
  * @since 29/03/2023

An interface that represents a client application that handles inboxes and outboxes.
@see ClientActivity
*/
interface App {
/**
    Retrieves the inbox of the application.
    @return the inbox of the application
    */
    Inbox getInbox();
/**
    Retrieves the outbox of the application.
    @return the outbox of the application
    */
    Outbox getOutbox();
/**
    Prints a demo of the application in action.
    @return a string that represents a demo of the application in action
    */
    String demo();
}