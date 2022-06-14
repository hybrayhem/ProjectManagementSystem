package test;

import ProjectManagementSystem.Issue;
import ProjectManagementSystem.IssueList;

public class IssueListTests {
    IssueListTests(){
        IssueList list = new IssueList("test");


        try {

            System.out.println(": Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + " : Failed");
        }

        try {
            System.out.println(list.addIssue(new Issue(1, "1", Issue.Status.development, Issue.Type.epic)));
            System.out.println(list.addIssue(new Issue(2, "2", Issue.Status.development, Issue.Type.bug)));
            System.out.println(list.addIssue(null));
            System.out.println(list.addIssue(new Issue(3, "3", Issue.Status.inProgress, Issue.Type.story)));
            System.out.println("Issue List addIssue: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue List addIssue : Failed");
        }

        try {
            System.out.println(list.deleteIssue(null));
            System.out.println(list.deleteIssue(new Issue(3, "3", Issue.Status.inProgress, Issue.Type.story)));
            System.out.println("Issue List deleteIssue: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue List deleteIssue : Failed");
        }

        try {
            System.out.println(list.getIssues().toString());
            System.out.println("Issue List getIssues: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue List getIssues : Failed");
        }

        try {
            System.out.println(list.getIssueQueue().toString());
            System.out.println("Issue List getIssueQueue: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue List getIssueQueue : Failed");
        }

        try {
            System.out.println(list.getTitle());
            System.out.println("Issue List getTitle: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue List getTitle : Failed");
        }

        try {
            System.out.println(list.setTitle("bla bla 2"));
            System.out.println("Issue List setTitle: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue List setTitle : Failed");
        }

        try {
            System.out.println(list.searchInIssueList("bla bla 2"));
            System.out.println(list.searchInIssueList("2"));
            System.out.println("Issue List searchInIssueList: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue List searchInIssueList : Failed");
        }
        try {
            System.out.println(list.searchInIssueList(2));
            System.out.println(list.searchInIssueList(13));
            System.out.println("Issue List searchInIssueList: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue List searchInIssueList : Failed");
        }
    }
}
