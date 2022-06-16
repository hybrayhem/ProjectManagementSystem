package test;

import ProjectManagementSystem.Backlog;
import ProjectManagementSystem.Issue;

public class BacklogTest {
    public static void main(String[] args) {
        System.out.println("*** Test Backlog ***");
        Backlog backlog = new Backlog();
        boolean success;

        Issue s1 = new Issue("Issue One", Issue.Status.development, Issue.Type.task);
        Issue s2 = new Issue("Issue Two", Issue.Status.development, Issue.Type.story);
        Issue s3 = new Issue("Issue Three", Issue.Status.inProgress, Issue.Type.bug);

        success = false;
        try{
            backlog.addIssue(s1);
            backlog.addIssue(s2);
            backlog.addIssue(s3);
            success = true;
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
        System.out.println("Add issue: " + success);
        System.out.println(backlog.toString() + "\n");

        System.out.println("Get top issue: " + backlog.getTopIssue().toString() + "\n");


        success = false;
        try{
            backlog.removeIssue(s1);
            backlog.removeLastIssue();
            success = true;
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
        System.out.println("Remove first and last issue: " + success);
        System.out.println(backlog.toString());


    }
}
