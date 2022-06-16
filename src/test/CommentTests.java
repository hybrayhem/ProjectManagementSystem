package test;

import ProjectManagementSystem.BoardMember;
import ProjectManagementSystem.Comment;

public class CommentTests {
    CommentTests(){
        Comment com = new Comment(new BoardMember( "bb", "bb", 1, "a"), "bla bla");

        try {
            System.out.println(com.getId());
            System.out.println("Comments getId: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Comments getId: Failed");
        }

        try {
            System.out.println(com.getOwner().toString());
            System.out.println("Comments getOwner: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Comments getOwner: Failed");
        }

        try {
            System.out.println(com.getData());
            System.out.println("Comments getData: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Comments getData: Failed");
        }

        try {
            System.out.println(com.getCreationDate().toString());
            System.out.println("Comments getCreationDate: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Comments getCreationDate: Failed");
        }

        try {
            System.out.println(com.setId(12));
            System.out.println(com.setId(-5));
            System.out.println("Comments setId: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Comments setId: Failed");
        }

        try {
            System.out.println(com.setOwner(new BoardMember( "bb", "bb", 1, "a")));
            System.out.println(com.setOwner(null));
            System.out.println("Comments setOwner: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Comments setOwner: Failed");
        }

        try {
            System.out.println(com.setData("new line"));
            System.out.println(com.setData(""));
            System.out.println("Comments setData: Success");
        } catch (Exception e) {
            System.err.println(e + "\n" + "Comments setData: Failed");
        }
    }
}
