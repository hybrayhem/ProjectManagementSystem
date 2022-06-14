package test;

import ProjectManagementSystem.BoardMember;
import ProjectManagementSystem.Issue;
import ProjectManagementSystem.User;

import java.util.Date;

public class IssueTests {
    IssueTests() {
        Issue i1, i2;
        i1 = new Issue(1, "i1", Issue.Status.inProgress, Issue.Type.epic);
        i2 = new Issue(2, "i2", Issue.Status.inProgress, Issue.Type.epic);
        try {

            System.out.println(": Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + " : Failed");
        }

        try{
            System.out.println(i1.setTitle("title"));
            System.out.println("Issue getLogHistory: Success");
        }catch (Exception e){
            System.err.println(e+"\n"+"Issue getLogHistory: Failed");
        }

        try{
            System.out.println(i1.setDescription("description"));
            System.out.println("Issue setDescription: Success");
        }catch (Exception e){
            System.err.println(e+"\n"+"Issue setDescription: Failed");
        }

        try{
            i1.updateUpdateTime();
            System.out.println("Issue updateUpdateTime: Success");
        }catch (Exception e){
            System.err.println(e+"\n"+"Issue updateUpdateTime: Failed");
        }

        try{
            System.out.println(i1.setDueDate(new Date(2022,06,15)));
            System.out.println("Issue setDueDate: Success");
        }catch (Exception e){
            System.err.println(e+"\n"+"Issue setDueDate: Failed");
        }

        try{
            i1.setPriority(Issue.Priority.High);
            System.out.println("Issue setPriority: Success");
        }catch (Exception e){
            System.err.println(e+"\n"+"Issue setPriority: Failed");
        }

        try{
            i1.setStatus(Issue.Status.inProgress);
            System.out.println("Issue setStatus: Success");
        }catch (Exception e){
            System.err.println(e+"\n"+"Issue setStatus: Failed");
        }

        try{
            i1.setType(Issue.Type.story);
            System.out.println("Issue setType: Success");
        }catch (Exception e){
            System.err.println(e+"\n"+"Issue setType: Failed");
        }

        try{
            System.out.println(i1.addComment("bla bla", new BoardMember(1, "c", "b", 2, "a")));
            System.out.println("Issue addComment: Success");
        }catch (Exception e){
            System.err.println(e+"\n"+"Issue addComment: Failed");
        }

        try{
            System.out.println(i1.removeComment(i1.getLastComment()));
            System.out.println("Issue removeComment: Success");
        }catch (Exception e){
            System.err.println(e+"\n"+"Issue removeComment: Failed");
        }

        try{
            System.out.println(i1.addAssignee( new BoardMember(1, "c", "b", 2, "a")));
            System.out.println("Issue addAssignee: Success");
        }catch (Exception e){
            System.err.println(e+"\n"+"Issue addAssignee: Failed");
        }

        try{
            System.out.println(i1.removeAssignee(new BoardMember(1, "c", "b", 2, "a")));
            System.out.println("Issue removeAssignee: Success");
        }catch (Exception e){
            System.err.println(e+"\n"+"Issue removeAssignee: Failed");
        }

        try{
            System.out.println(i1.toString());
            System.out.println("Issue toString: Success");
        }catch (Exception e){
            System.err.println(e+"\n"+"Issue toString: Failed");
        }

        try {
            System.out.println(i1.compareTo(i2));
            System.out.println("Issue compare: Success");
        } catch (Exception e) {
            System.err.println("Issue compare: Failed");
        }

        try {
            System.out.println(i1.getId());
            System.out.println("Issue getId: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue getId: Failed");
        }

        try {
            System.out.println(i1.getTitle());
            System.out.println("Issue getTitle: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue getTitle: Failed");
        }

        try {
            System.out.println(i1.getDescription());
            System.out.println("Issue getDescription: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue getDescription: Failed");
        }

        try {
            System.out.println(i1.getCreateTime());
            System.out.println("Issue getCreateTime: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue getCreateTime: Failed");
        }

        try {
            System.out.println(i1.getUpdateTime());
            System.out.println("Issue getUpdateTime: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue getUpdateTime: Failed");
        }

        try {
            System.out.println(i1.getDueDate());
            System.out.println("Issue getDueDate: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue getDueDate: Failed");
        }

        try {
            System.out.println(i1.getPriority());
            System.out.println("Issue getPriority: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue getPriority: Failed");
        }

        try {
            System.out.println(i1.getStatus());
            System.out.println("Issue getStatus: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue getStatus: Failed");
        }

        try {
            System.out.println(i1.getType());
            System.out.println("Issue getType: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue getType: Failed");
        }

        try {
            System.out.println(i1.addChildIssue(i2));
            System.out.println("Issue addChildIssue: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue addChildIssue: Failed");
        }

        try {
            System.out.println(i1.getChildIssue().getTitle());
            System.out.println("Issue getChildIssue: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue getChildIssue: Failed");
        }

        try {
            System.out.println(i1.getLastComment().getData());
            System.out.println("Issue getLastComment: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue getLastComment: Failed");
        }

        try {
            System.out.println(i1.getAssignees());
            System.out.println("Issue getAssignees: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue getAssignees: Failed");
        }

        try {
            System.out.println(i1.getLogHistory());
            System.out.println("Issue getLogHistory: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Issue getLogHistory: Failed");
        }
    }
}
