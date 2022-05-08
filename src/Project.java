import BTS.BinarySearchTree;

import java.util.List;

public class Project {
    private int id;
    private String key;
    private String name;
    private String type;
    private ProjectManager projectManager;
    private BinarySearchTree<ProjectMember> projectMember;
    private MyArrayList<Board> board;
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

    public BinarySearchTree<ProjectMember> getProjectMember() {
        return projectMember;
    }

    public void setProjectMember(BinarySearchTree<ProjectMember> projectMember) {
        this.projectMember = projectMember;
    }

    public MyArrayList<Board> getBoards() {
        return board;
    }

    public void setBoard(MyArrayList<Board> board) {
        this.board = board;
    }

    public Backlog getBacklog() {
        return backlog;
    }

    public void setBacklog(Backlog backlog) {
        this.backlog = backlog;
    }
}
