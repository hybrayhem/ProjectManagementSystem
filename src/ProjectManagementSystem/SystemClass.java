package ProjectManagementSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemClass {
    private static final String filePath = "files/login.txt";
    private Admin admin;
    public List<Project> projects;

    private final ArrayList<User> users;

    public void addUser(User user){
        this.users.add(user);
    }

    public SystemClass(Admin admin) {
        this.admin = admin;
        this.projects = new ArrayList<>();
         users = new ArrayList<>();
    }
    public SystemClass(){
        this.projects = new ArrayList<>();
        users = new ArrayList<>();
    }

    public String login() throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        String username_input, username_real="";
        String password_input, password_real="", userType = null;
        int remainTrying = 3;

        File myObj = new File(filePath);
        Scanner myReader = new Scanner(myObj);

        while(true){

            System.out.print("Username : ");
            username_input = scanner.nextLine();
            scanner.nextInt();
            System.out.print("Password : ");
            password_input = scanner.nextLine();

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                Scanner sc=new Scanner(data);
                username_real = sc.next();
                password_real = sc.next();
                userType = sc.next();

                if (username_input.equals(username_real)){
                    break;
                }
                sc.close();
            }
            myReader.close();

            if (username_real.equals(username_input) && password_real.equals(password_input)) {
                System.out.println("Login Sucesfully...");
            } else {
                remainTrying--;
                System.out.println("Wrong username or password..");
                if (remainTrying == 0) {
                    System.out.println("You are not allowed to enter...");
                    break;
                }
                System.out.println("You have " + remainTrying + " entrie(s) left. Try again..");
            }
        }
        return userType;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public boolean addProject(Project project){
        return this.projects.add(project);
    }
    public boolean deleteProject(Project key){
        return this.projects.remove(key);
    }
    public List<Project> getProjects() {
        return this.projects;
    }

    public void setProjects(List<Project> project) {
        this.projects = project;
    }
}
