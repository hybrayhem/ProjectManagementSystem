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
    public Guest(int id, String username, String fullname, int contact, String teams,Board invitedBoard) {
        super(id,username,fullname,contact,teams);
        this.invitedBoard = invitedBoard;
    }

    public Guest(int id, String username, String name, String pw) {
        super(id, username, name, pw);
    }
    public Issue.Status changeIssueStatus(Issue i, Issue.Status s){
        System.out.println("You don't have permission to change issue status!");
        return null;
    }
    public void editIssueTitle(Issue i, String s){
        System.out.println("You don't have permission to edit issue title!");
    }
    public void editIssueComment(){
        System.out.println("You don't have permission to edit issue comment!");
    }
    public void removeIssueComment(Issue i){
        System.out.println("You don't have permission to remove issue comment!");
    }
    public void addIssueComment(Issue i, Comment c){
        System.out.println("You don't have permission to add issue comment!");
    }
    public void viewBoard(Board board) {
        System.out.println(board.toString());
    }
}