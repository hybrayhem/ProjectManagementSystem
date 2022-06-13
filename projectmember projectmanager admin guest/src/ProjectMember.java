public class ProjectMember extends BoardMember{
    protected Project project;
    public ProjectMember(int id, String username,String fullname, int contact, String teams,
                         Project project, List<Board> assignedBoards){
        super(id,username,fullname,contact,teams,assignedBoards);
        this.project = project;
    }
    public void viewBacklog(){
        System.out.println(project.backlog.toString());

    }
    public void viewProject(){
        System.out.println("Project name: "+project.getName());
        System.out.println("Project id: "+project.getId());
        System.out.println("Project key: "+project.getKey());
        System.out.println("Project type: "+project.getType());
        System.out.println("Project Manager of the project: "+project.getProjectManager());
        System.out.println("Project members: "+project.getProjectMembers().toString());
    }
}