package test;

import ProjectManagementSystem.Board;
import ProjectManagementSystem.BoardMember;
import ProjectManagementSystem.Issue;
import ProjectManagementSystem.IssueList;

public class BoardTest {
    public static void main(String[] args) {
        System.out.println("*** Test Board ***");
        Board board = new Board();

        // Test members
        BoardMember m1 = new BoardMember(0, "m1", "Member One", 505, "Software");
        BoardMember m2 = new BoardMember(1, "m2", "Member Two", 505, "Electronics");
        BoardMember m3 = new BoardMember(2, "m3", "Member Three", 505, "Mechanics");

        boolean success = false;
        try{
            board.addMember(m1);
            board.addMember(m2);
            board.addMember(m3);
            success = true;
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
        System.out.println("Add member success: " + success);
        System.out.println(board.getMembers().toString());


        // Test issues
        Issue s1 = new Issue(0, "Issue One", Issue.Status.development, Issue.Type.task);
        Issue s2 = new Issue(1, "Issue Two", Issue.Status.development, Issue.Type.story);
        Issue s3 = new Issue(2, "Issue Three", Issue.Status.inProgress, Issue.Type.bug);
        IssueList issueList = new IssueList("Todo");

        success = false;
        try{
            board.addIssueList(issueList);
            board.addIssue(s1, 0);
            board.addIssue(s2, 0);
            board.addIssue(s3, 0);
            success = true;
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
        System.out.println("Add issue success: " + success);

        issueList = board.getIssues().get(0);
        System.out.print("Issue titles: ");
        System.out.print(issueList.getIssues().get(0).getTitle() + ", ");
        System.out.print(issueList.getIssues().get(1).getTitle() + ", ");
        System.out.println(issueList.getIssues().get(2).getTitle() + ", ");
    }
}
