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
    public void viewBoard(Board board){
        System.out.println(board.toString());
    }
    
    public Issue.Status changeIssueStatus(Issue issue, Issue.Status status){
        Issue.Status previousStatus = issue.getStatus();
        issue.setStatus(status);
        return previousStatus;
    }
    public String editIssueTitle(Issue issue, String title){
        String previousTitle = issue.getTitle();
        issue.setTitle(title);
        return previousTitle;
    }

    public boolean removeIssueComment(Issue issue,Comment comment){
        if(issue == null){
            System.out.println("No issue found");
            return false;
        }else if(comment == null){
            System.out.println("Invalid comment");
            return false;
        }
        return issue.removeComment(comment);
    }
    public boolean removeIssueComment(Issue issue,String data){
        if(issue == null){
            System.out.println("No issue found");
            return false;
        }else if(data == null){
            System.out.println("Invalid comment");
            return false;
        }
        for(int i = 0; i < issue.getComments().size();i++){
            if(issue.getComments().get(i).getData().equals(data)){
                return issue.removeComment(issue.getComments().get(i));
            }
        }
        return false;
    }
    public boolean addIssueComment(Issue issue, String line, User user){
        if(issue == null){
            System.out.println("No issue found");
            return false;
        }
        return issue.addComment(line, user);
    }
    public boolean addIssueComment(Issue issue, Comment comment){
        if(issue == null){
            System.out.println("No issue found");
            return false;
        }
        return issue.addComment(comment.getData(), comment.getOwner());
    }

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
