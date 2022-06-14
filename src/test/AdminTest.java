package test;

import ProjectManagementSystem.Admin;

public class AdminTest {
    public static void main(String[] args) {
        Admin admin = new Admin(1,null,null,1,null,null,null,null);
        //admin.createIssue();
        //admin.createProject();
        //admin.createUser();
        IssueTests i = new IssueTests();
        CommentTests c = new CommentTests();
        IssueListTests il = new IssueListTests();

    }
}
