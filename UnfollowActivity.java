/**
 * @author kavane39
 * @since 29/03/2023
 *
 * A class that represents an "unfollow" activity in a social media context, where a user unfollows another user.
 * This class extends the ClientActivity class.
 *
 * @see ClientActivity
 */
public class UnfollowActivity extends ClientActivity<UnfollowActivity> {

    /** The actor who performed the unfollow action */
    private Person actor;

    /** The person who was unfollowed */
    private Person object;

    /** A summary of the unfollow activity */
    private String summary;

    /**
     * Constructs a new UnfollowActivity with the specified URI, summary, actor, and object.
     *
     * @param URI the URI of the activity
     * @param summary a summary of the activity
     * @param actor the actor who performed the unfollow action
     * @param object the person who was unfollowed
     */
    UnfollowActivity(String URI, String summary, Person actor, Person object) {
        super(URI);
        setSummary(summary);
        setActor(actor);
        setObject(object);
    }

    /**
     * Sets the actor who performed the unfollow action.
     *
     * @param actor the actor who performed the unfollow action
     */
    public void setActor(Person actor) {
        this.actor = actor;
    }

    /**
     * Sets the person who was unfollowed.
     *
     * @param object the person who was unfollowed
     */
    public void setObject(Person object) {
        this.object = object;
    }

    /**
     * Sets the summary of the unfollow activity.
     *
     * @param summary a summary of the unfollow activity
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Returns the actor who performed the unfollow action.
     *
     * @return the actor who performed the unfollow action
     */
    public Person getActor() {
        return this.actor;
    }

    /**
     * Returns the person who was unfollowed.
     *
     * @return the person who was unfollowed
     */
    public Person getObject() {
        return this.object;
    }

    /**
     * Returns a summary of the unfollow activity.
     *
     * @return a summary of the unfollow activity
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * Removes the object from the actor's followers list and removes the actor from the object's following list.
     *
     * @param actor the actor who performed the unfollow action
     * @param object the person who was unfollowed
     */
    public void unfollow(Person actor, Person object) {
        if (actor.getFollowers().contains(object)) {
            actor.getFollowers().remove(object);
        }
        if (object.getFollowing().contains(actor)) {
            object.getFollowing().remove(actor);
        }
    }
}
