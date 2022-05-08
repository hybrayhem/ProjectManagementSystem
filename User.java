/** User of the System. */
public abstract class User {
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
    public abstract void viewBoard(Board board);
    
    public final abstract void changeIssueStatus(Issue issue, Status status) {
        issue.setStatus(status);
    }

    public final abstract void editIssueTitle(Issue issue, String title) {
        issue.setTitle(title);
    }

    public final abstract void removeIssueComment(Issue issue, Comment com) {
        issue.removeComment(com);
    }

    public final abstract void addIssueComment(Issue issue, Comment com) {
        issue.addComment(
    }
}
