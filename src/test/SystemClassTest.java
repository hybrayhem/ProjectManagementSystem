package test;

import ProjectManagementSystem.*;

public class SystemClassTest {

    SystemClassTest(){
        SystemClass system1 = null;
        SystemClass system2 = null;

        try{
            system1 = new SystemClass();
            system2 = new SystemClass(new Admin( null, null, 1, null, null, null, null));
            System.out.println("Project Object creation : Success");
        }
        catch (Exception e){
            System.out.println("Project Object creation : Failed");
        }

        try {
            assert system1 != null;
            System.out.println(system1.login());
            System.out.println("System Login : Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "System Login : Failed");
        }

        try {
            assert system2 != null;
            System.out.println(system2.login());
            System.out.println("System Login : Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "System Login : Failed");
        }

        try {
            System.out.println(system1.addProject(null));
            system1.addUser(new ProjectManager( null, null, 1, null, null, new Board()));
            System.out.println("Add User & Add Project : Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Add User & Add Project : Failed");
        }

    }
}
