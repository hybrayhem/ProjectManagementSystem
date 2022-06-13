/** User of the System. */
public abstract class User implements Comparable<User>{
    // Data Fields
    /**  */
    private int id;
    /**   */
    private String username;
    /**  */
    private String fullname;


    private String password;
    /**  */
    private int contact;
    /**  */
    private String teams;

    // Constructors
    public User(int id, String username, String fullname, String password, int contact, String teams) {
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.contact = contact;
        this.teams = teams;
    }

    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getTeams() {
        return teams;
    }

    public void setTeams(String teams) {
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

    public User(User guest) {

    }

    // Methods
    public void viewBoard(){
        return;
    }
    
    public Status changeIssueStatus(Issue issue, Status status) {

        return null;
    }

    public void editIssueTitle(Issue issue, String title) {

    }

    public void removeIssueComment(Issue issue) {

    }

    public void addIssueComment(Issue issue, Comment comment) {

    }

    // Methods
    public abstract void viewBoard(Board board);
}
