package test;
import ProjectManagementSystem.ProjectMember;
import java.util.Calendar;
import java.util.Stack;
import ProjectManagementSystem.Backlog;
import ProjectManagementSystem.Project;
import ProjectManagementSystem.Issue;
public class ProjectMemberTest {
    ProjectMemberTest(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH,11);
        c.set(Calendar.DATE,05);
        c.set(Calendar.YEAR,2025);
        Stack<Issue> issues = new Stack<>();
        Issue issue1 = new Issue(1, "title0", Issue.Status.development, Issue.Type.bug);
        issue1.setDueDate(c.getTime());
        issue1.setPriority(Issue.Priority.High);
        issue1.setDescription("description1");
        Issue issue2 = new Issue(2, "title1", Issue.Status.development, Issue.Type.bug);
        issue2.setDueDate(c.getTime());
        issue2.setPriority(Issue.Priority.High);
        issue2.setDescription("description2");
        Issue issue3 = new Issue(3, "title2", Issue.Status.development, Issue.Type.bug);
        issue3.setDueDate(c.getTime());
        issue3.setPriority(Issue.Priority.High);
        issue3.setDescription("description3");
        Issue issue4 = new Issue(41, "title3", Issue.Status.development, Issue.Type.bug);
        issue4.setDueDate(c.getTime());
        issue4.setPriority(Issue.Priority.High);
        issue4.setDescription("description4");
        issues.push(issue1);
        issues.push(issue2);
        issues.push(issue3);
        issues.push(issue4);
        Backlog backlog = new Backlog(issues);
        Project project2 = new Project();
        Project project = new Project(1, "key", "name", "type", null, null, 
                         null, backlog);
        ProjectMember projectMember = new ProjectMember(1, "username", "fullname",
                                      1, "teams",project,null);
        projectMember.viewBacklog();
        ProjectMember projectMember2 = new ProjectMember(1, "username", "fullname",
                                        1, "teams", project2, null);
        try{
            projectMember2.viewBacklog();
        }catch(Exception e ){
            System.err.println("An error occured when displaying backlog");
        }
    }
}
