public class ProjectManager extends ProjectMember {
    public ProjectManager(int id, String username,String fullname, int contact, 
                          String teams, Project project, List<Board> assignedBoards){
        super(id, username, fullname, contact, teams, project, assignedBoards);             
    }
    // how will users know they are assigned?
    public void assingUser(Issue issue,User user){
        issue.addAssignee(user);
    }   
}