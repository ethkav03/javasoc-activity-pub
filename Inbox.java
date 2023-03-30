/**
  * @author kavane39
  * @since 29/03/2023

    The Inbox interface provides functionality for receiving and reading messages.
    @see ClientInbox
    */
    public interface Inbox extends ReceiveMessage, ReadNextMessage {

    /**
        @return the count of unread messages in the inbox.
        */
        int getCount();
    }