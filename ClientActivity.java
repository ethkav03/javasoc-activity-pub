/**
 * @author kavane39
 * @since 29/03/2023

    A class that represents a client activity and implements the {@link Activity} interface.
    @see Activity

    @param <Activity> the type of the activity
    */
    public class ClientActivity<Act> implements Activity {
      private String URI;

      /**
      Constructs a client activity with the specified URI.
      @param URI the URI of the client activity
      */
      ClientActivity(String URI) {
        this.URI = URI;
      }
      /**
      Returns the URI of the client activity.
      @return the URI of the client activity
      */
      public String getURI() {
        return this.URI;
      }
    }