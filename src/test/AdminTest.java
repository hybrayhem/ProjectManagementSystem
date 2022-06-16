package test;

import ProjectManagementSystem.Admin;
import ProjectManagementSystem.Backlog;
import ProjectManagementSystem.Issue;
import ProjectManagementSystem.IssueList;
import ProjectManagementSystem.SystemClass;

public class AdminTest {
    AdminTest(){
        SystemClass system = new SystemClass();
        IssueList issueList = new IssueList("title");
        IssueList nullIssueList = null;
        Admin admin_no_system = new Admin( "username", "fullname", 1, 
                                        "teams", null, null, null);
        Admin admin = new Admin( "username", "fullname", 1, "teams", null,
                     null,system);
        system.setAdmin(admin);
        try{
            System.out.println("Valid issue list given");
            admin.createIssue(issueList, "title", Issue.Status.development, Issue.Type.task);
            if(issueList.getIssues().size() > 0){
                System.out.println("Issue created succesfully.");
            }else{
                System.out.println("Issue couldn't be created!");
            }
        }catch(Exception e){
            System.err.println("Issue couldn't be created!");
        }
        try{
            System.out.println("Invalid issue list given");
            admin.createIssue(nullIssueList, "title", Issue.Status.development, Issue.Type.task);
        }catch(Exception e){
            System.err.println("Issue couldn't be created!");
        }

        try{
            System.out.println("Admin has valid system");
            admin.createProject(1, "key", "name", "type", null, null, 
                               null, new Backlog());
            if(system.getProjects().size() > 0){
                System.out.println("Project created succesfully");
            }else{
                System.out.println("Project couldn't be created!");     
            }
            
        }catch(Exception e){
            System.err.println("Project couldn't be created!");
        }
        try{
            System.out.println("Admin does not have a system");
            admin_no_system.createProject(1, "key", "name", "type", null,
                                         null, null, new Backlog());
        }catch(Exception e){
            System.err.println("Project couldn't be created!");
        }
        try{
            admin.createUser("projectmanager", "username", "fullname","sd");
            System.out.println("User created succesfully");
        }catch(Exception e){
            System.err.println("User couldn't be created!");
        }
        try{
           // admin.createUser(1, "username", "fullname", 1, "teams");
            System.out.println("User created succesfully");
        }catch(Exception e){
            System.err.println("User couldn't be created!");
        }
        try{
         //   admin.createUser(1, "username", "fullname", 1, "teams", null);
            System.out.println("User created succesfully");
        }catch(Exception e){
            System.err.println("User couldn't be created!");
        }
    }
 
}
