import java.util.Scanner;

public class SystemClass {

    private Admin admin;
    private MyArrayList<Project> project;

    public SystemClass(Admin admin) {
        this.admin = admin;
        this.project = new MyArrayList<>();
    }
    public SystemClass(){
        this.project = new MyArrayList<>();
    }

    public boolean login(Member member) {

        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        int remainTrying = 3;

        while(true){

            System.out.print("Username : ");
            username = scanner.nextLine();
            System.out.print("Password : ");
            password = scanner.nextLine();

            if (member.getUsername().equals(username) && member.getPassword().equals(password)) {
                System.out.println("Login Sucesfully...");
                return true;
            } else {
                remainTrying--;
                System.out.println("Wrong username or password..");
                if (remainTrying == 0) {
                    System.out.println("You are not allowed to enter...");
                    return false;
                    break;
                }
                System.out.println("You have " + remainTrying + " entrie(s) left. Try again..");
            }
        }
    }

    public static void profilMenu(){
        // To do
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public boolean addProject(Project project){
        return this.project.add(project);
    }
    public boolean deleteProject(Project key){
        return this.project.delete(key);
    }
    public MyArrayList<Project> getProjects() {
        return this.project;
    }

    public void setProjects(MyArrayList<Project> project) {
        this.project = project;
    }
}
