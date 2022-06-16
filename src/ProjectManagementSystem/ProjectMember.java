package ProjectManagementSystem;

import java.io.Serializable;
import java.util.List;

public class ProjectMember extends BoardMember implements Serializable{
    protected Project project;
    public ProjectMember(int id, String username,String fullname, int contact, String teams,
                         Project project, List<Board> assignedBoards){
        super(id,username,fullname,contact,teams,assignedBoards);
        this.project = project;
    }
    public ProjectMember(int id, String username, String fullname, String password) {
        super(id, username, fullname, password);
    }
    public ProjectMember(int id, String username,String fullname, int contact, 
                         String teams, Project project, Board assignedBoard){
        super(id, username, fullname, contact, teams);   
        this.project = project;  
        addBoard(assignedBoard);        
    }
    public void viewBacklog(){
        if(project.getBacklog() == null){
            System.out.println("There is no backlog to view.");
        }
        else{
            System.out.println(project.getBacklog().toString());
        }
    }
    public void viewProject(){
        if(project == null){
            System.out.println("There is no project to view");
            return;
        }
        System.out.println("Project name: "+project.getName());
        System.out.println("Project id: "+project.getId());
        System.out.println("Project key: "+project.getKey());
        System.out.println("Project type: "+project.getType());
        System.out.println("Project Manager of the project: "+project.getProjectManager());
        // binary search tree toString() should be implemented
      //  System.out.println("Project members: "+project.getProjectMembers().toString());
    }
}