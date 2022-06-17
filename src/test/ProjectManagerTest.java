package test;
import ProjectManagementSystem.Board;
import ProjectManagementSystem.Issue;
import ProjectManagementSystem.Project;
import ProjectManagementSystem.ProjectManager;
import ProjectManagementSystem.ProjectMember;
import ProjectManagementSystem.User;
public class ProjectManagerTest {
    ProjectManagerTest(){
        Project project = new Project();
        User user = new ProjectMember( "username", "fullname", 1, "teams", project, new Board());
        Issue issue = new Issue("title", Issue.Status.development, Issue.Type.task);
        ProjectManager projectManager = new ProjectManager( "username", "fullname"
                                        , 1, "teams", project, new Board());
        projectManager.assignUser(issue, user);
        if(issue.getAssignees().contains(user)){
            System.out.println("User assigned succesfully");
        }else{
            System.err.println("User couldn't be assigned!");
        }
        System.out.println("Invalid issue, error will occur");
        projectManager.assignUser(new Issue(), user);
        System.out.println("Invalid user, error will occur");
        projectManager.assignUser(issue, null);
        System.out.println("Invalid issue and user, error will occur");
        projectManager.assignUser(new Issue(), null);
    }  
}
