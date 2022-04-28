public class Guest extends User{
    private Board invitedBoard;
    public void viewBoard(){
        System.out.println(invitedBoard.toString());
    }
}