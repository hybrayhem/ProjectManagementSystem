import java.util.Scanner;

public class Login {

    public boolean login(Member member) {

        Scanner scanner = new Scanner(System.in);
        String username;
        String password;

        System.out.print("Username : ");
        username = scanner.nextLine();
        System.out.print("Password : ");
        password = scanner.nextLine();

        if (member.getUsername().equals(username) && member.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}