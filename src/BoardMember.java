import java.util.List;

/** Users who are assigned to a specific board. */
public class BoardMember extends User implements Comparable<User> {
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
}