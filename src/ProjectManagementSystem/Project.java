package ProjectManagementSystem;

import BST.BinarySearchTree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Project implements Serializable{
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
        this.backlog = backlog;
        users = members;
        board = boards;
    }
    public Project(int id, String key, String name, String type, ProjectManager lead){
        this.id = id;
        this.key = key;
        this.name = name;
        this.type = type;
        this.projectManager = lead;
        users = new BinarySearchTree<User>();
        board = new ArrayList<>();
    }
    public Project(int id, String key, String name, String type){
        this.id = id;
        this.key = key;
        this.name = name;
        this.type = type;
        users = new BinarySearchTree<User>();
        board = new ArrayList<>();
    }
    public Project(ProjectManager projectManager){
        this.projectManager = projectManager;
        users = new BinarySearchTree<User>();
        board = new ArrayList<>();
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
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id:"+id+"\n");
        if(name != null){
            sb.append("Name:"+name+"\n");
        }else{
            sb.append("Name: undefined\n");
        }
        if(type != null){
            sb.append("Type:"+type+"\n");
        }else{
            sb.append("Type: undefined\n");
        }
        if(projectManager != null){
            sb.append("Manager:"+projectManager+"\n");
        }else{
            sb.append("Manager: undefined\n");
        }if(board != null){
            sb.append("Boards:\n"+board.toString()+"\n");
        }else{
            sb.append("Boards: undefined\n");
        }
        if(backlog != null){
            sb.append("Backlog:\n"+backlog.toString()+"\n");
        }else{
            sb.append("Backlog: undefined\n");
        }
        if(users != null){
            sb.append("Users:"+users.toString()+"\n");
        }else{
            sb.append("Users: undefined\n");
        }
        return sb.toString();
    }

}
