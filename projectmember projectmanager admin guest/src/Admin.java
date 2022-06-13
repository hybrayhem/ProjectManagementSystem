import java.util.List;

public class Admin extends ProjectManager {
    private SystemClass system;
    public Admin(int id, String username,String fullname, int contact,String teams, 
                 Project project, List<Board> assignedBoards, SystemClass system){
        super(id, username, fullname, contact, teams, project, assignedBoards);
        this.system = system;
    }

    public void createProject(int id, String key, String name, String type, ProjectManager lead, 
                              BinarySearchTree<ProjectMember> members, List<Board> boards, Backlog backlog){
        if(system == null){
            System.out.println("Project cannot be created, invalid system!");
        }
        else{
            system.projects.add(new Project(id,key,name,type,lead,members,boards,backlog));
        }
    }

    public void createIssue(IssueList issueList,int id, String title, String description, Comment comments,
                            Date createTime, Date updateTime,Date dueDate, 
                            Enum priority, Enum status, Enum type,Issue childIssue,
                            List<User> assignee, List<String> logHistory )
    {
        Issue issue = new Issue(id,title,description,comments,createTime,updateTime,
                                dueDate,priority,status,type,childIssue,assignee,logHistory);
        if(issueList == null){
            System.out.println("Issue couldn't be added, try to add somewhere else.");
        }
        else{
            issueList.add(issue);
        }
    }
    public void createUser(String usertype,int id,String username, String fullname, int contact, String teams){
        switch (usertype) {
            case "boardmember":
                system.users.add(new BoardMember(id,username,fullname,contact,teams));
                break;
            case "projectmember":
                system.users.add(new ProjectMember(id,username,fullname,contact,teams));
                break;
            case "projectmanager":
                system.users.add(new ProjectManager(id,username,fullname,contact,teams));     
                break;
            case "guest":
                system.users.add(new Guest(id,username,fullname,contact,teams));
                break;
            default:
                System.out.println("User couldn't be added");
        }
    }
}
