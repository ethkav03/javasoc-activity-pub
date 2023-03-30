/**
 * @author kavane39
 * @since 29/03/2023
 *
 * Represents a "like" activity in a social media or social networking context,
 * where users can "like" or show approval for posts or other objects shared on the platform.
 * @see ClientActivity
 */
public class LikeActivity extends ClientActivity<LikeActivity> {
    
    /** The summary of the activity */
    private String summary;
    
    /** The actor who performed the activity */
    private Person actor;
    
    /** The object that the activity was performed on */
    private StreamObject streamObject;

    /**
     * Constructs a new LikeActivity with the specified URI, summary, actor, and stream object.
     * @param URI the URI of the activity
     * @param summary the summary of the activity
     * @param actor the actor who performed the activity
     * @param streamObject the object that the activity was performed on
     */
    LikeActivity (String URI, String summary, Person actor, StreamObject streamObject) {
        super(URI);
        setSummary(summary);
        setActor(actor);
        setStreamObject(streamObject);
    }

    /**
     * Sets the summary of the activity.
     * @param summary the summary of the activity
     */
    public void setSummary (String summary) {
        this.summary = summary;
    }

    /**
     * Sets the actor who performed the activity.
     * @param actor the actor who performed the activity
     */
    public void setActor (Person actor) {
        this.actor = actor;
    }

    /**
     * Sets the object that the activity was performed on.
     * @param streamObject the object that the activity was performed on
     */
    public void setStreamObject (StreamObject streamObject) {
        this.streamObject = streamObject;
    }

    /**
     * Returns the summary of the activity.
     * @return the summary of the activity
     */
    public String getSummary () {
        return this.summary;
    }

    /**
     * Returns the actor who performed the activity.
     * @return the actor who performed the activity
     */
    public Person getActor () {
        return this.actor;
    }

    /**
     * Returns the object that the activity was performed on.
     * @return the object that the activity was performed on
     */
    public StreamObject getStreamObject () {
        return this.streamObject;
    }

    /**
     * Adds a "like" activity to the actor's liked list and the object's likes list.
     * @param actor the actor who performed the "like" activity
     * @param object the object that the "like" activity was performed on
     */
    public void like (Person actor, StreamObject object) {
        actor.getLiked().add(object);
        object.getLikes().add(actor);
    }

    /**
     * Returns the number of "likes" the object has.
     * @param object the object to get the number of "likes" for
     * @return the number of "likes" the object has
     */
    public int likesAmount (StreamObject object) {
        return object.getLikes().size();
    }
}
