/**
 * @author kavane39
 * @since 29/03/2023
 *
 * The CreateActivity class represents an activity that can be performed by a user (represented by the "actor" object)
 * on a "streamObject", and has a summary that describes the activity.
 * @see ClientActivity
 */
public class CreateActivity extends ClientActivity<CreateActivity> {
    private Person actor;
    private StreamObject streamObject;
    private String summary;

    /**
     * Constructs a CreateActivity object with the given URI, summary, actor, and streamObject.
     *
     * @param URI          the URI of the activity
     * @param summary      the summary that describes the activity
     * @param actor        the user (represented by a Person object) who performed the activity
     * @param streamObject the object (represented by a StreamObject object) on which the activity was performed
     */
    CreateActivity(String URI, String summary, Person actor, StreamObject streamObject) {
        super(URI);
        setSummary(summary);
        setActor(actor);
        setStreamObject(streamObject);
    }

    /**
     * Sets the actor (user) of this activity.
     *
     * @param actor the user (represented by a Person object) who performed the activity
     */
    public void setActor(Person actor) {
        this.actor = actor;
    }

    /**
     * Sets the streamObject on which this activity was performed.
     *
     * @param streamObject the object (represented by a StreamObject object) on which the activity was performed
     */
    public void setStreamObject(StreamObject streamObject) {
        this.streamObject = streamObject;
    }

    /**
     * Sets the summary that describes this activity.
     *
     * @param summary the summary that describes the activity
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Returns the actor (user) of this activity.
     *
     * @return the user (represented by a Person object) who performed the activity
     */
    public Person getActor() {
        return this.actor;
    }

    /**
     * Returns the summary that describes this activity.
     *
     * @return the summary that describes the activity
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * Returns the streamObject on which this activity was performed.
     *
     * @return the object (represented by a StreamObject object) on which the activity was performed
     */
    public StreamObject getStreamObject() {
        return this.streamObject;
    }
}
