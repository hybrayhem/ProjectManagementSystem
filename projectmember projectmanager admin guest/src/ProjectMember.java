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
        System.out.println(project.toString());
    }
}