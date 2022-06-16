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
    
    public void createIssue(IssueList issueList, String title, Enum status, Enum type )
    {
        Issue issue = new Issue(title, (Issue.Status) status, (Issue.Type) type);
        if(issueList == null){
            System.out.println("Issue couldn't be added, try to add somewhere else.");
        }
        else{
            issueList.addIssue(issue);
        }
    }



    public void createUser(int id,String username, String fullname, int contact, String teams){
        system.addUser(new BoardMember(id,username,fullname,contact,teams)); 
    }
    public void createUser(String usertype,int id,String username, String fullname, int contact, 
                           String teams,Project project, List<Board> assignedBoards){
        switch(usertype){
            case "projectmember":
               system.addUser(new ProjectMember(id,username,fullname,contact,teams,project,assignedBoards));
               break;
            case "projectmanager":
               system.addUser(new ProjectManager(id,username,fullname,contact,teams,project,assignedBoards));
               break;
            default:
               System.out.println("User couldn't be created!");
        }
    }
    public void createUser(int id,String username, String fullname, int contact, String teams,Board invitedBoard){
        system.addUser(new Guest(id,username,fullname,contact,teams,invitedBoard));
    }
}
