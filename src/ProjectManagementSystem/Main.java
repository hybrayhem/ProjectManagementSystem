package ProjectManagementSystem;

import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("*** GTU PROJECT MANAGEMENT AND PLANNING SYSTEM ***");
        SystemClass system = new SystemClass();
        String userType = system.login();

        if (userType == null){
            System.out.println("Good Bye..");
            return;
        }

        while(true) {

            switch (userType) {
                case "Admin":
                    menuAdmin(system);
                    break;
                case "ProjectMember":

                    break;
                case "Guest":

                    break;
                case "ProjectManager":

                    break;
                case "BoardMember":

                    break;
            }

        }

    }
    public static void menuAdmin(SystemClass system){

        Scanner scanner = new Scanner(System.in);

        System.out.println("1- Create Project");
        System.out.println("2- Create Issue");
        System.out.println("3- Create User");
        System.out.println("4- Logout");

        int projectOption = scanner.nextInt();

        if (projectOption == 1) {
            // get user info
            system.addProject(new Project());
        } else if (projectOption == 2) {

        } else if (projectOption == 3) {

        } else if (projectOption == 4) {
            System.out.println("Good Bye..");
            return;

        }
    }
}

