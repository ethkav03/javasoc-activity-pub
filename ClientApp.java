/**
 * @author kavane39
 * @since 29/03/2023
 *
 * A class that etends the ClientActivity class. Executes the action of a user unfollowing another user.
 * @see ClientActivity
 */

public class ClientApp implements App {
    private Inbox inbox;
    private Outbox outbox;

    /**
    Constructor for ClientApp
     */
    ClientApp () {
        inbox = new ClientInbox();
        outbox = new ClientOutbox();
    }

    /**
    Retrieves the inbox of the application.
    @return the inbox of the application
    */
    public Inbox getInbox () {
        return this.inbox;
    }

    /**
    Retrieves the outbox of the application.
    @return the outbox of the application
    */
    public Outbox getOutbox () {
        return this.outbox;
    }

    /**
    Prints a demo of the application in action.
    @return a string that represents a demo of the application in action
    */
    public String demo () {
        // creates person1
        Person p1 = new Person("https://www.kavane39.com/user/kavane39", "Ethan Kavanagh", "kavane39", "Created user Person1");
        System.out.println("Person1 added");
        System.out.println("- URI: " + p1.getURI());
        System.out.println("- name: " + p1.getName() + "\n");

        // creates person2
        Person p2 = new Person("https://www.kavane39.com/user/kavanj49", "Jamie Kavanagh", "kavanj49", "Created user Person2");
        System.out.println("Person2 added");
        System.out.println("- URI: " + p2.getURI());
        System.out.println("- name: " + p2.getName() + "\n");

        // creates a new post
        StreamObject ob1 = new StreamObject("https://www.kavane39.com/objects/001", null, null, Audience.GLOBAL, "This is the first post in JavaVerse!", "First Post", "2023-03-28T11:14:00");
        CreateActivity c1 = new CreateActivity("https://www.kavane39.com/posts/001", "Person1 creates new post", p1, ob1);
        System.out.println("Person1 adds a CreateActivity to Outbox");
        System.out.println("- URI: " + c1.getURI());
        System.out.println("- audience: " + c1.getStreamObject().getAudience());
        System.out.println("- likes: " + c1.getStreamObject().getLikes());
        System.out.println("- shares: " + c1.getStreamObject().getShares());
        System.out.println("- content: " + c1.getStreamObject().getContent());
        System.out.println("- name: " + c1.getStreamObject().getName());
        System.out.println("- published: " + c1.getStreamObject().getPublished());
        System.out.println("- deleted: " + c1.getStreamObject().getDeleted() + "\n");
        p1.getOutbox().send(c1);

        // displays person1's outbox
        System.out.println("Person1 Outbox Delivery");
        System.out.println(p1.getOutbox() + "\n");

        // Person2 follows Person1
        FollowActivity f1 = new FollowActivity("https://www.kavane39.com/user/kavanj49/follow/kavane39", "Person2 follows Person1", p2, p1);
        System.out.println("Person2 adds a FollowActivity to Outbox");
        System.out.println("- URI: " + f1.getURI());
        System.out.println("- actor: " + f1.getActor().getURI());
        System.out.println("- object: " + f1.getObject().getURI() + "\n");
        f1.follow(p2, p1);
        p2.getOutbox().send(f1);
        p1.getInbox().receive(f1);

        // displays person2's outbox
        System.out.println("Person2 Outbox Delivery");
        System.out.println(p2.getOutbox() + "\n");

        // displays person1's inbox
        System.out.println("Person1 Inbox Delivery");
        System.out.println(p1.getInbox() + "\n");

        // reads follow from inbox
        System.out.println("Person1 reads a FollowActivity from Inbox");
        System.out.println("- " + p1.getInbox().readNext().getURI() + "\n");

        // displays person1's outbox
        System.out.println("Person2 Outbox Delivery");
        System.out.println(p2.getOutbox() + "\n");

        // Person1 likes post
        LikeActivity l1 = new LikeActivity("https://www.kavane39.com/kavane39/likes/post001", "person1 likes post1", p1, ob1);
        System.out.println("Person1 adds a LikeActivity to Outbox");
        System.out.println("- URI: " + l1.getURI());
        System.out.println("- actor: " + l1.getActor().getURI());
        System.out.println("- object: " + l1.getActor().getURI() + "\n");
        l1.like(p1, ob1);
        p1.getOutbox().send(l1);

        // displays person1's outbox
        System.out.println("Person1 Outbox Delivery");
        System.out.println(p1.getOutbox() + "\n");

        // Person1 follows Person2
        FollowActivity f2 = new FollowActivity("https://www.kavane39.com/user/kavane39/follow/kavanj49", "Person1 follows Person2", p1, p2);
        System.out.println("Person2 adds a FollowActivity to Outbox");
        System.out.println("- URI: " + f2.getURI());
        System.out.println("- actor: " + f2.getActor().getURI());
        System.out.println("- object: " + f2.getObject().getURI() + "\n");
        f1.follow(p1, p2);
        p1.getOutbox().send(f2);
        p2.getInbox().receive(f2);

        // displays person1's outbox
        System.out.println("Person1 Outbox Delivery");
        System.out.println(p1.getOutbox() + "\n");

        // displays person2's inbox
        System.out.println("Person2 Inbox Delivery");
        System.out.println(p2.getInbox() + "\n");

        // Person2 unfollows Person1
        UnfollowActivity u1 = new UnfollowActivity("https://www.kavane39.com/user/kavanj49/unfollow/kavane39", "Person2 unfollows Person1", p2, p1);
        System.out.println("Person2 adds an UnfollowActivity to Outbox");
        System.out.println("- URI: " + u1.getURI());
        System.out.println("- actor: " + u1.getActor().getURI());
        System.out.println("- object: " + u1.getObject().getURI() + "\n");
        u1.unfollow(p2, p1);
        p2.getOutbox().send(u1);
        p1.getInbox().receive(u1);

        // displays person2's outbox
        System.out.println("Person2 Outbox Delivery");
        System.out.println(p2.getOutbox() + "\n");

        // displays person1's inbox
        System.out.println("Person1 Inbox Delivery");
        System.out.println(p1.getInbox() + "\n");

        // delete post
        DeleteActivity d1 = new DeleteActivity("https://www.kavane39.com/delete/post/001", "delete post001", p1, c1);
        System.out.println("Person1 adds DeleteActivity to Inbox");
        System.out.println("- URI: " + d1.getURI());
        System.out.println("- actor: " + d1.getActor().getURI());
        System.out.println("- object: " + d1.getCreateActivity().getURI() + "\n");
        d1.delete(c1);
        d1.getActor().getInbox().receive(d1);

        // reads deleteactivity from inbox
        System.out.println("Person1 reads a UnfollowActivity from Inbox");
        System.out.println("- " + p1.getInbox().readNext().getURI() + "\n");

        // read Person1 inbox
        System.out.println("Person1 Inbox Delivery");
        System.out.println(p1.getInbox() + "\n");

        // read Person1 outbox
        System.out.println("Person1 Outbox Delivery");
        System.out.println(p1.getOutbox() + "\n");

        // read Person2 Inbox
        System.out.println("Person2 Inbox Delivery");
        System.out.println(p2.getInbox() + "\n");

        // read Person2 Outbox
        System.out.println("Person2 Outbox Delivery");
        System.out.println(p2.getOutbox());

        return "";
    }

    /**
    main function, runs on start
    @param args[]
     */
    public static void main (String args[]) {
        ClientApp C = new ClientApp();
        System.out.println(C.demo());
    }
}