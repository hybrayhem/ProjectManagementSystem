package ProjectManagementSystem;

import BST.BinarySearchTree;

import java.util.List;

public class Project {
    private int id;
    private String key;
    private String name;
    private String type;
    private ProjectManager projectManager;
    private BinarySearchTree<User> users;
    private List<Board> board;
    private Backlog backlog;

    public Project(int id, String key, String name, String type, ProjectManager lead, BinarySearchTree<User> members, List<Board> boards, Backlog backlog) {
        this.id = id;
        this.key = key;
        this.name = name;
        this.type = type;
        this.projectManager = lead;
    }

    public Project() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProjectManager getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(ProjectManager projectManager) {
        this.projectManager = projectManager;
    }

//    public ProjectMember getProjectMember(String username){
//        return this.projectMembers.find();// To: do
//    }
    public void setProjectMember(ProjectMember projectMember){
        this.users.add(projectMember);
    }

    public BinarySearchTree<User> getProjectMembers() {
        return users;
    }

    public void editBoard(){
        // To : do
    }


    public Board getBoard(int id){
        return this.board.get(id);
    }
    public boolean setBoard(Board board){
        return this.board.add(board);
    }

    public List<Board> getBoards() {
        return board;
    }

    public void setBoards(List<Board> board) {
        this.board = board;
        this.board.addAll(board);
    }

    public Backlog getBacklog() {
        return backlog;
    }

    public void setBacklog(Backlog backlog) {
        this.backlog = backlog;
    }

}
