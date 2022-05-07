public class Guest extends User{
    private Board invitedBoard;
    public void viewBoard(){
        System.out.println(invitedBoard.toString());
    }
    public void changeIssueStatus(){
        System.out.println("You don't have permission to change issue status!");
    }
    public void editIssueTitle(){
        System.out.println("You don't have permission to edit issue title!");
    }
    public void editIssueComment(){
        System.out.println("You don't have permission to edit issue comment!");
    }
    public void removeIssueComment(){
        System.out.println("You don't have permission to remove issue comment!");
    }
    public void addIssueComment(){
        System.out.println("You don't have permission to add issue comment!");
    }
}