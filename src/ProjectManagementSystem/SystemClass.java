package ProjectManagementSystem;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        this();
        this.admin = admin;
    }
    public SystemClass(){
        this.projects = new ArrayList<>();
        users = new ArrayList<>();
        loadUsers();
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
    /**
     * Load the saved users from users.bin file
     */
    public void loadUsers(){
        try
        {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream("users.bin"));
            try{
                while(true){
                    users.add((User) o.readObject());
                }
            }catch(EOFException e){
                System.out.println("All the users are loaded");
            }            
            o.close();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
    /**
     * Save the users into users.bin file 
     * This method will be called when the user exit the program
     */
    public void saveUsers(){
        try
        {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("users.bin"));
            for(int i = 0; i < users.size();i++){
                o.writeObject(users.get(i));
            }
            o.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
     /**
     * Load the saved projects from projects.bin file
     */
    public void loadProjects(){
        try
        {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream("projects.bin"));
            try{
                while(true){
                    projects.add((Project) o.readObject());
                }
            }catch(EOFException e){
                System.out.println("All the projects are loaded");
            }            
            o.close();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
    /**
     * Save the projects into projects.bin file 
     * This method will be called when the user exit the program
     */
    public void saveProjects(){
        try
        {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("projects.bin"));
            for(int i = 0; i < projects.size();i++){
                o.writeObject(projects.get(i));
            }
            o.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
