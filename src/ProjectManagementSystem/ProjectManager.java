package ProjectManagementSystem;

import java.util.List;

public class ProjectManager extends ProjectMember {
    public ProjectManager(int id, String username,String fullname, int contact, 
                          String teams, Project project, List<Board> assignedBoards){
        super(id, username, fullname, contact, teams, project, assignedBoards);             
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