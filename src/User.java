/** User of the System. */
public abstract class User implements Comparable<User> {
    // Data Fields
    /**  */
    private int id;
    /**   */
    private String username;
    /**  */
    private String fullname;
    /**  */
    private int contact;
    /**  */
    private String teams;

    // Constructors
    public User(int id, String username, String fullname, int contact, String teams) {
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.contact = contact;
        this.teams = teams;
    }

    public User(User guest) {

    }

    // Methods
    public abstract void viewBoard();
    
    public abstract status changeIssueStatus(Issue issue, Status status) {

    }

    public abstract void editIssueTitle(Issue issue, String title) {

    }

    public abstract void removeIssueComment(Issue issue) {

    }

    public abstract void addIssueComment(Issue issue, Comment comment) {

    }

    // Methods
    public abstract void viewBoard(Board board);
}
