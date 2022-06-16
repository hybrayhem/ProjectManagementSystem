package ProjectManagementSystem;
import java.util.List;

import BST.BinarySearchTree;

public class Admin extends ProjectManager {
    private SystemClass system;
    public Admin(int id, String username,String fullname, int contact,String teams, 
                 Project project, List<Board> assignedBoards, SystemClass system){
        super(id, username, fullname, contact, teams, project, assignedBoards);
        this.system = system;
    }

    public Admin(int id, String username, String fullname, String password){
        super(id, username, fullname, password);

    }
    public Admin(int id, String username, String fullname, String password,SystemClass system){
        super(id, username, fullname, password);
        this.system = system;

    }
    public SystemClass getSystem(){
        return system;
    }
    public void setSystem(SystemClass system){
        this.system = system;
    }

    public void createProject(int id, String key, String name, String type, ProjectManager lead, 
                              BinarySearchTree<User> members, List<Board> boards, Backlog backlog){
        if(system == null){
            System.out.println("Project cannot be created, invalid system!");
        }
        else{
            system.projects.add(new Project(id,key,name,type,lead,members,boards,backlog));
        }
    }

    public void createEmptyProject(){
        system.projects.add(new Project());
    }





    public void createUser(String usertype,int id,String username, String fullname, int contact, String teams,Board board){
        switch(usertype){
            case "boardmember":
                BoardMember boardMember = new BoardMember(id,username,fullname,contact,teams);
                boardMember.addBoard(board);
                system.addUser(boardMember); 
                break;
            case "guest":
                system.addUser(new Guest(id,username,fullname,contact,teams,board));       
        }   
    }
    public void createUser(String usertype,int id,String username, String fullname, int contact, 
                           String teams,Project project, Board assignedBoard){
        switch(usertype){
            case "projectmember":
               system.addUser(new ProjectMember(id,username,fullname,contact,teams,project,assignedBoard));
               break;
            case "projectmanager":
               system.addUser(new ProjectManager(id,username,fullname,contact,teams,project,assignedBoard));
               break;
            default:
               System.out.println("User couldn't be created!");
        }
    }

}
