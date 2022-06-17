package ProjectManagementSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/** Users who are assigned to a specific board. */
public class BoardMember extends User implements Serializable {
    // Data Fields
    /** */
    private List<Board> assignedBoards;

    // Constructors
    public BoardMember(String username, String fullname, int contact, String teams, List<Board> assignedBoards) {
        super( username, fullname, contact, teams);
        this.assignedBoards = assignedBoards;
    }
    public BoardMember(String username, String fullname, int contact, String teams) {
        super(username, fullname, contact, teams);
        assignedBoards = new ArrayList<>();
    }
    public BoardMember(String username, String fullname, int contact, String teams,Board board) {
        super( username, fullname, contact, teams);
        assignedBoards = new ArrayList<>();
    }

    public BoardMember( String username, String fullname, String password) {
        super( username, fullname, password);
        assignedBoards = new ArrayList<>();
    }
    public void addBoard(Board board){
        assignedBoards.add(board);
    }
    public List<Board> getBoards(){
        return assignedBoards;
    }

    public Board getBoardByID(int id){
        for(Board board : assignedBoards){
            if(board.getId() == id) return board;
        }
        return null;
    }

    // Methods
    @Override
    public void viewBoard(Board board) {
        System.out.println(board.toString());
    }
//    public Issue.Status changeIssueStatus(Issue i, Issue.Status s){
//        System.out.println("You don't have permission to change issue status!");
//        return null;
//    }
//    public String editIssueTitle(Issue i, String s){
//        System.out.println("You don't have permission to edit issue title!");
//        return null;
//    }
//    public void editIssueComment(){
//        System.out.println("You don't have permission to edit issue comment!");
//    }
//    public void removeIssueComment(Issue i){
//        System.out.println("You don't have permission to remove issue comment!");
//    }
//    public boolean removeIssueComment(Issue issue,String data){
//        System.out.println("You don't have permission to remove issue comment!");
//        return false;
//    }
//    public boolean addIssueComment(Issue issue, String line, User user){
//        System.out.println("You don't have permission to add issue comment!");
//        return false;
//    }
//    public boolean addIssueComment(Issue i, Comment c){
//        System.out.println("You don't have permission to add issue comment!");
//        return false;
//    }
}