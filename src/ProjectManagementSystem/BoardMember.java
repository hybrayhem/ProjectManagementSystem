package ProjectManagementSystem;

import java.util.List;

/** Users who are assigned to a specific board. */
public class BoardMember extends User  {
    // Data Fields
    /** */
    private List<Board> assignedBoards;

    // Constructors
    public BoardMember(int id, String username, String fullname, int contact, String teams, List<Board> assignedBoards) {
        super(id, username, fullname, contact, teams);
        this.assignedBoards = assignedBoards;
    }
    public BoardMember(int id, String username, String fullname, int contact, String teams) {
        super(id, username, fullname, contact, teams);
    }

    // Methods
    @Override
    public void viewBoard(Board board) {
        System.out.println(board.toString());
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
}