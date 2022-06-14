package ProjectManagementSystem;

/** User of the System. */
public abstract class User implements Comparable<User>{
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

    @Override
    public int compareTo(User o) {
        User o0 = this;
        if(o0.fullname.compareToIgnoreCase(o.fullname) > 0)
            return 1;
        else if(o0.fullname.compareToIgnoreCase(o.fullname) < 0)
            return -1;
        else
            return 0;
    }
    User(){

    }

    public User(User guest) {

    }

    // Methods
    public abstract void viewBoard(Board board);
    
    public abstract Issue.Status changeIssueStatus(Issue issue, Issue.Status status);
    public abstract void editIssueTitle(Issue issue, String title) ;

    public abstract void removeIssueComment(Issue issue);
    public abstract void addIssueComment(Issue issue, Comment comment);
}
