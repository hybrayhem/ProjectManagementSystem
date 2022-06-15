package ProjectManagementSystem;

import java.io.Serializable;

/** User of the System. */
public abstract class User implements Comparable<User>, Serializable{
    // Data Fields
    /**  */
    private int id;
    /**   */
    private String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**  */
    private String fullname;
    /**  */
    private int contact;
    /**  */
    private String teams;
    private String password;

    // Constructors
    public User(int id, String username, String fullname, int contact, String teams) {
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.contact = contact;
        this.teams = teams;
    }
    public User(int id, String username, String fullname, String password){
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.password = password;
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
    public int getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getFullname(){
        return fullname;
    }
    public int getContact(){
        return contact;
    }
    public String getTeams(){
        return teams;
    }

    // Methods
    public abstract void viewBoard(Board board);
    
    public abstract Issue.Status changeIssueStatus(Issue issue, Issue.Status status);
    public abstract void editIssueTitle(Issue issue, String title) ;

    public abstract void removeIssueComment(Issue issue);
    public abstract void addIssueComment(Issue issue, Comment comment);

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", fullname='" + fullname + '\'' +
                ", contact=" + contact +
                ", teams='" + teams + '\'' +
                '}';
    }
}
