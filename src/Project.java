import BST.BinarySearchTree;

public class Project {
    private int id;
    private String key;
    private String name;
    private String type;
    private ProjectManager projectManager;
    private BinarySearchTree<ProjectMember> projectMembers;
    private List<Board> board;
    private Backlog backlog;

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

    public ProjectMember getProjectMember(String username){
        return this.projectMembers.find();// To: do
    }
    public void setProjectMember(ProjectMember projectMember){
        this.projectMembers.add(projectMember);
    }

    public BinarySearchTree<ProjectMember> getProjectMembers() {
        return projectMember;
    }

    public void setProjectMembers(BinarySearchTree<ProjectMember> projectMember) {
        this.projectMember = projectMember;
    }

    public void editBoard(){
        // To : do
    }
    public Board getBoard(int id){
        return this.board.search(id);
    }
    public boolean setBoard(Board board){
        return this.board.add(board);
    }

    public List<Board> getBoards() {
        return board;
    }

    public void setBoards(List<Board> board) {
        this.board = board;
    }

    public Backlog getBacklog() {
        return backlog;
    }

    public void setBacklog(Backlog backlog) {
        this.backlog = backlog;
    }

}
