package ProjectManagementSystem;

import java.io.Serializable;
import java.util.List;

public class ProjectManager extends ProjectMember implements Serializable{
    public ProjectManager(int id, String username,String fullname, int contact, 
                          String teams, Project project, List<Board> assignedBoards){
        super(id, username, fullname, contact, teams, project, assignedBoards);             
    }
    public ProjectManager(int id, String username,String fullname, int contact, 
                          String teams, Project project, Board assignedBoard){
        super(id, username, fullname, contact, teams, project, assignedBoard);             
    }
    public ProjectManager(int id, String username, String fullname, String password){
        super(id, username, fullname, password);
    }
    public void assignUser(Issue issue,User user){
        if(issue == null){
            System.out.println("User cannot be assigned because the issue doesn't exist.");
        }
        else if(user == null){
            System.out.println("User couldn't be added because user doesn't exist");
        }
        else{
            issue.addAssignee(user);
        }
    }   
}