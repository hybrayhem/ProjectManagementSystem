package ProjectManagementSystem;
import java.util.List;

import BST.BinarySearchTree;

public class Admin extends ProjectManager {
    private SystemClass system;
    public Admin( String username,String fullname, int contact,String teams, 
                 Project project, List<Board> assignedBoards, SystemClass system){
        super( username, fullname, contact, teams, project, assignedBoards);
        this.system = system;
    }

    public Admin(String username, String fullname, String password){
        super( username, fullname, password);

    }
    public Admin( String username, String fullname, String password,SystemClass system){
        super( username, fullname, password);
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

    public Project createEmptyProject(ProjectManager projectManager){
        Project project = new Project(projectManager);
        system.projects.add(project);
        return project;
    }





    public void createUser(String usertype,String username,String fullname, String password){
        switch(usertype){
            case "boardmember":
                BoardMember boardMember = new BoardMember(username,fullname,password);
                system.addUser(boardMember); 
                break;
            case "guest":
                system.addUser(new Guest(username,fullname,password));   
                break;    
            case "projectmember":
               system.addUser(new ProjectMember(username,fullname,password));
               break;
            case "projectmanager":
               system.addUser(new ProjectManager(username,fullname,password));
               break;
            default:
               System.out.println("User couldn't be created!");
        }   
    }
}
