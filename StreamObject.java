/**
 * @author kavane39
 * @since 29/03/2023
 */

import java.util.ArrayList;
import java.util.List;

/**
 * A class representing a social media stream object.
 */
public class StreamObject {
    
    /** The unique identifier of the stream object. */
    private String URI;
    
    /** Any attachment associated with the object. */
    private String attachment;
    
    /** The entity that created the object. */
    private String attributedTo;
    
    /** The intended audience of the object. */
    private Audience audience;
    
    /** The list of users who have liked the object. */
    private List<Person> likes;
    
    /** The number of times the object has been shared. */
    private int shares;
    
    /** The main content of the object. */
    private String content;
    
    /** The name or title of the object. */
    private String name;
    
    /** The date and time when the object was published. */
    private String published;
    
    /** A flag indicating whether the object has been deleted. */
    private boolean deleted;

    /**
     * Constructs a new StreamObject with the given properties.
     * 
     * @param URI the unique identifier of the object
     * @param attachment any attachment associated with the object
     * @param attributedTo the entity that created the object
     * @param audience the intended audience of the object
     * @param content the main content of the object
     * @param name the name or title of the object
     * @param published the date and time when the object was published
     */
    public StreamObject(String URI, String attachment, String attributedTo, Audience audience, String content, String name, String published) {
        setURI(URI);
        setAttachment(attachment);
        setAttributedTo(attributedTo);
        setAudience(audience);
        this.likes = new ArrayList<>();
        this.shares = 0;
        setContent(content);
        setName(name);
        setPublished(published);
        this.deleted = false;
    }

    // setters
    /**
     * Sets the URI of the object.
     * 
     * @param URI the unique identifier of the object
     */
    public void setURI(String URI) {
        this.URI = URI;
    }

    /**
     * Sets the attachment of the object.
     * 
     * @param attachment any attachment associated with the object
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    /**
     * Sets the entity that created the object.
     * 
     * @param attributedTo the entity that created the object
     */
    public void setAttributedTo(String attributedTo) {
        this.attributedTo = attributedTo;
    }

    /**
     * Sets the intended audience of the object.
     * 
     * @param audience the intended audience of the object
     */
    public void setAudience(Audience audience) {
        this.audience = audience;
    }

    /**
     * Sets the main content of the object.
     * 
     * @param content the main content of the object
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Sets the name or title of the object.
     * 
     * @param name the name or title of the object
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the date and time when the object was published.
     * 
     * @param published the date and time when the object was published
     */
    public void setPublished(String published) {
        this.published = published;
    }

    //getters
    /**
     * Returns the URI of the post.
     *
     * @return the URI of the post
     */
    public String getURI() {
        return this.URI;
    }

    /**
     * Returns the attachment associated with the post.
     *
     * @return the attachment associated with the post
     */
    public String getAttachment() {
        return this.attachment;
    }

    /**
     * Returns the person or organization that the post is attributed to.
     *
     * @return the person or organization that the post is attributed to
     */
    public String getAttributedTo() {
        return this.attributedTo;
    }

    /**
     * Returns the audience that the post is intended for.
     *
     * @return the audience that the post is intended for
     */
    public Audience getAudience() {
        return this.audience;
    }

    /**
     * Returns the list of people who have liked the post.
     *
     * @return the list of people who have liked the post
     */
    public List<Person> getLikes() {
        return this.likes;
    }

    /**
     * Returns the number of times the post has been shared.
     *
     * @return the number of times the post has been shared
     */
    public int getShares() {
        return this.shares;
    }

    /**
     * Returns the content of the post.
     *
     * @return the content of the post
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Returns the name of the post.
     *
     * @return the name of the post
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the date and time that the post was published.
     *
     * @return the date and time that the post was published
     */
    public String getPublished() {
        return this.published;
    }

    /**
     * Indicates whether the post has been deleted.
     *
     * @return true if the post has been deleted, false otherwise
     */
    public boolean getDeleted() {
        return this.deleted;
    }

    /**
     * Sets the deleted flag to true, indicating that the post has been deleted.
     */
    public void delete() {
        this.deleted = true;
    }

    /**
     * Returns a string representation of the object, including the URI, audience, likes, shares, content, name,
     * published, and deleted fields.
     *
     * @return a string representation of the object
     */
    public String toString () {
        return "- URI: " + this.getURI() + "\n- audience: " + this.getAudience() + "\n- likes: " + this.getLikes() + "\n- shares: " + this.getShares() + "\n- content: " + this.getContent() + "\n- name: " + this.getName() + "\n- published: " + this.getPublished() + "\n- deleted: " + this.getDeleted();
    }
}