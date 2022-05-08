import BTS.MyArrayList;

import java.util.Scanner;

public class SystemClass {

    private Admin admin;
    private MyArrayList<Project> project;

    public SystemClass(Admin admin) {
        this.admin = admin;
        this.project = new MyArrayList<>();
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

    public MyArrayList<Project> getProject() {
        return this.project;
    }

    public void setProject(MyArrayList<Project> project) {
        this.project = project;
    }


}
