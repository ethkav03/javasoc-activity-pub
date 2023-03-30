/**
 * @author kavane39
 * @since 29/03/2023
 *
 * The FollowActivity class represents an action of one person following another person on a social network platform.
 * @see ClientActivity
 */
public class FollowActivity extends ClientActivity<FollowActivity> {
    private Person actor;
    private Person object;
    private String summary;
    private String URI;

    /**
     * Constructs a new FollowActivity object with the provided URI, summary, actor, and object.
     * 
     * @param URI the Uniform Resource Identifier that uniquely identifies the FollowActivity object
     * @param summary a brief description of the action
     * @param actor the person who performed the follow action
     * @param object the person who was followed
     */
    FollowActivity(String URI, String summary, Person actor, Person object) {
        super(URI);
        setSummary(summary);
        setActor(actor);
        setObject(object);
    }

    /**
     * Sets the actor of this FollowActivity object to the provided person.
     * 
     * @param actor the person who performed the follow action
     */
    public void setActor(Person actor) {
        this.actor = actor;
    }

    /**
     * Sets the object of this FollowActivity object to the provided person.
     * 
     * @param object the person who was followed
     */
    public void setObject(Person object) {
        this.object = object;
    }

    /**
     * Sets the summary of this FollowActivity object to the provided string.
     * 
     * @param summary a brief description of the action
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Returns the actor of this FollowActivity object.
     * 
     * @return the person who performed the follow action
     */
    public Person getActor() {
        return this.actor;
    }

    /**
     * Returns the object of this FollowActivity object.
     * 
     * @return the person who was followed
     */
    public Person getObject() {
        return this.object;
    }

    /**
     * Returns the summary of this FollowActivity object.
     * 
     * @return a brief description of the action
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * Adds the provided object to the list of followers of the provided actor, and adds the provided actor to the list of following of the provided object.
     * 
     * @param actor the person who performed the follow action
     * @param object the person who was followed
     */
    public void follow(Person actor, Person object) {
        actor.getFollowers().add(object);
        object.getFollowing().add(actor);
    }
}
