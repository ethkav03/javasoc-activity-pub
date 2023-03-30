/**
 * @author kavane39
 * @since 29/03/2023
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a person in a social media platform.
 */
public class Person {

    private String URI; // URI of the person's profile
    private String name; // name of the person
    private String preferredUsername; // preferred username of the person
    private String summary; // summary of the person's profile
    private Inbox inbox; // inbox of the person
    private Outbox outbox; // outbox of the person
    private List<Person> followers; // list of people who follow the person
    private List<Person> following; // list of people the person follows
    private List<StreamObject> liked; // list of posts the person has liked

    /**
     * Constructs a new Person object with the specified URI, name, preferred username, and summary.
     * Initializes the person's inbox and outbox as instances of ClientInbox and ClientOutbox, respectively.
     * Initializes the followers, following, and liked lists as empty ArrayLists.
     *
     * @param URI the URI of the person's profile
     * @param name the name of the person
     * @param preferredUsername the preferred username of the person
     * @param summary the summary of the person's profile
     */
    public Person(String URI, String name, String preferredUsername, String summary) {
        setURI(URI);
        setName(name);
        setPreferredUsername(preferredUsername);
        setSummary(summary);
        inbox = new ClientInbox();
        outbox = new ClientOutbox();
        followers = new ArrayList<>();
        following = new ArrayList<>();
        liked = new ArrayList<>();
    }

    /**
     * Sets the URI of the person's profile.
     *
     * @param URI the URI of the person's profile
     */
    public void setURI(String URI) {
        this.URI = URI;
    }

    /**
     * Sets the name of the person.
     *
     * @param name the name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the preferred username of the person.
     *
     * @param preferredUsername the preferred username of the person
     */
    public void setPreferredUsername(String preferredUsername) {
        this.preferredUsername = preferredUsername;
    }

    /**
     * Sets the summary of the person's profile.
     *
     * @param summary the summary of the person's profile
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Returns the URI of the person's profile.
     *
     * @return the URI of the person's profile
     */
    public String getURI() {
        return this.URI;
    }

    /**
     * Returns the name of the person.
     *
     * @return the name of the person
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the preferred username of the person.
     *
     * @return the preferred username of the person
     */
    public String getPreferredUsername() {
        return this.preferredUsername;
    }

    /**
     * Returns the summary of the person's profile.
     *
     * @return the summary of the person's profile
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * Returns the inbox of the person.
     *
     * @return the inbox of the person
     */
    public Inbox getInbox() {
        return this.inbox;
    }

/**

    Returns the outbox of the person.
    @return The outbox of the person.
    */
    public Outbox getOutbox () {
        return this.outbox;
    }

/**

    Returns a list of followers of the person.
    @return List<Person> of followers of the person.
    */
    public List<Person> getFollowers () {
        return this.followers;
    }

/**

    Returns a list of persons that the person is following.
    @return List<Person> of persons that the person is following.
    */
    public List<Person> getFollowing () {
        return this.following;
    }

/**

    Returns a list of stream objects that the person has liked.
    @return List<StreamObject> that the person has liked.
    */
    public List<StreamObject> getLiked () {
        return this.liked;
    }
}