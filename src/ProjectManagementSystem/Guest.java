package ProjectManagementSystem;

public class Guest extends User{
    private Board invitedBoard;
    public void viewBoard(){
        if(invitedBoard == null){
            System.out.println("There is no board to view!");
        }
        else{
            System.out.println(invitedBoard.toString());
        }
    }
    public Guest( String username, String fullname, int contact, String teams,Board invitedBoard) {
        super(username,fullname,contact,teams);
        this.invitedBoard = invitedBoard;
    }

    public Guest( String username, String name, String pw) {
        super( username, name, pw);
    }
    public void setBoard(Board board){
        this.invitedBoard = board;
    }
    public Issue.Status changeIssueStatus(Issue i, Issue.Status s){
        System.out.println("You don't have permission to change issue status!");
        return null;
    }
    public String editIssueTitle(Issue i, String s){
        System.out.println("You don't have permission to edit issue title!");
        return null;
    }
    public void editIssueComment(){
        System.out.println("You don't have permission to edit issue comment!");
    }
    public void removeIssueComment(Issue i){
        System.out.println("You don't have permission to remove issue comment!");
    }
    public boolean removeIssueComment(Issue issue,String data){
        System.out.println("You don't have permission to remove issue comment!");
        return false;
    }
    public boolean addIssueComment(Issue issue, String line, User user){
        System.out.println("You don't have permission to add issue comment!");
        return false;
    }
    public boolean addIssueComment(Issue i, Comment c){
        System.out.println("You don't have permission to add issue comment!");
        return false;
    }
    public void viewBoard(Board board) {
        System.out.println(board.toString());
    }
}