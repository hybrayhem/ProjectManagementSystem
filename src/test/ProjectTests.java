package test;

import ProjectManagementSystem.Project;

public class ProjectTests {
    ProjectTests(){

        Project project = null;
        Project project1 = null;

        try{
            project = new Project();
            project1 = new Project(0, null, null, null,null, null, null, null);
            System.out.println("Project Object creation : Success");
        }
        catch (Exception e){
            System.out.println("Project Object creation : Failed");
        }


        try {
            System.out.println(project.getBoards());
            System.out.println(project1.getBacklog());
            System.out.println("Project getBoards & getBacklog : Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Project getBoards || getBacklog : Failed");
        }



    }
}
