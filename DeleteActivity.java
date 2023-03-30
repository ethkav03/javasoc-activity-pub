/**
 * @author kavane39
 * @since 29/03/2023
 *
 * This class represents an activity that can be performed by a user to delete a CreateActivity object.
 * It extends the ClientActivity class and provides functionality to delete the StreamObject associated with a CreateActivity.
 */
public class DeleteActivity extends ClientActivity<DeleteActivity> {
    
    /**
     * The Person object representing the user performing the delete activity.
     */
    private Person actor;
    
    /**
     * The CreateActivity object that is being deleted.
     */
    private CreateActivity createActivity;
    
    /**
     * A String summary of the delete activity.
     */
    private String summary;

    /**
     * Constructor for the DeleteActivity class.
     * @param URI The URI of the activity.
     * @param summary A String summary of the activity.
     * @param actor The Person object representing the user performing the delete activity.
     * @param createActivity The CreateActivity object that is being deleted.
     */
    DeleteActivity (String URI, String summary, Person actor, CreateActivity createActivity) {
        super(URI);
        setSummary(summary);
        setActor(actor);
        setCreateActivity(createActivity);
    }

    /**
     * Sets the actor of this activity to the given Person object.
     * @param actor The Person object representing the user performing the delete activity.
     */
    public void setActor (Person actor) {
        this.actor = actor;
    }

    /**
     * Sets the createActivity of this activity to the given CreateActivity object.
     * @param createActivity The CreateActivity object that is being deleted.
     */
    public void setCreateActivity (CreateActivity createActivity) {
        this.createActivity = createActivity;
    }

    /**
     * Sets the summary of this activity to the given String.
     * @param summary A String summary of the activity.
     */
    public void setSummary (String summary) {
        this.summary = summary;
    }

    /**
     * Returns the actor of this activity (i.e. the Person object representing the user performing the delete activity).
     * @return The Person object representing the user performing the delete activity.
     */
    public Person getActor () {
        return this.actor;
    }

    /**
     * Returns the summary of this activity (i.e. a String summary of the delete activity).
     * @return A String summary of the delete activity.
     */
    public String getSummary () {
        return this.summary;
    }

    /**
     * Returns the createActivity of this activity (i.e. the CreateActivity object being deleted).
     * @return The CreateActivity object being deleted.
     */
    public CreateActivity getCreateActivity () {
        return this.createActivity;
    }

    /**
     * Deletes the StreamObject associated with the given CreateActivity object.
     * @param createActivity The CreateActivity object to be deleted.
     */
    public void delete (CreateActivity createActivity) {
        createActivity.getStreamObject().delete();
    }
}
