package ProjectManagementSystem;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    //After Database integration,  It will be converted to Database.getAdmins(),Database.getManagers... .
    static ArrayList<Admin> admins = new ArrayList<>();
    static ArrayList<ProjectManager> managers = new ArrayList<>();
    static ArrayList<ProjectMember> members = new ArrayList<>();
    static ArrayList<Guest> guests = new ArrayList<>();
    static ArrayList<BoardMember> boardMembers = new ArrayList<>();
    static int adminId=0;
    static int projectManagerId=0;
    static int projectMemberId=0;
    static int guestsId=0;
    static int boardMemberId=0;

    static int projectId=0;



    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("*** GTU PROJECT MANAGEMENT AND PLANNING SYSTEM ***");
        Scanner input = new Scanner(System.in);
        SystemClass system = new SystemClass();

        int opt;
        do{
            System.out.println("1)Register\n2)Login\n3)Exit");
            opt = input.nextInt(); input.nextLine();
            switch (opt) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Wrong info");
            }
        }while(opt!=3);

    }


    public static void register(){

        Scanner input = new Scanner(System.in);
        int opt;

        do {
            System.out.println("Choose Account Type:\n1)Admin"+ "2)Project Manager\n3)Board Member\n4)Project Member\n5)Guest\n6)Exit");
            opt = input.nextInt(); input.nextLine();
            System.out.println("Enter full name:");
            String name = input.nextLine();
            System.out.println("Enter username:");
            String username = input.nextLine();
            System.out.println("Enter password:");
            String pw = input.nextLine();

            switch (opt){
                case 1:
                    admins.add(new Admin(adminId++, username, name, pw ));
                    break;
                case 2:
                    managers.add(new ProjectManager(projectManagerId++, username, name, pw ));

                    break;
                case 3:
                    boardMembers.add(new BoardMember(boardMemberId++, username, name, pw ));
                    break;
                case 4:
                    members.add(new ProjectMember(projectMemberId++, username, name, pw ));
                    break;
                case 5:
                    guests.add(new Guest(guestsId++, username, name, pw ));
                    break;
                case 6:
                    System.out.println("Redirecting to main menu.");
                    break;
                default:
                    System.out.println("Invalid selection..");
            }

        }while(opt!=6);

    }

    public static void login(){

        Scanner input = new Scanner(System.in);
        int opt;
        boolean loggedIn = false;
        System.out.println("Choose Account Type:\n1)Admin"+ "2)Project Manager\n3)Board Member\n4)Project Member\n5)Guest\n6)Exit");
        opt = input.nextInt(); input.nextLine();
        System.out.println("Your username: ");
        String username = input.nextLine();
        System.out.println("Your password: ");
        String pw = input.nextLine();

        switch (opt){
            case 1:
                for(Admin admin : admins){
                    if(admin.getUsername().equals(username) && admin.getPassword().equals(pw)) {
                        adminMenu(admin);
                        loggedIn = true;
                        break;
                    }
                }
                break;
            case 2:
                for(ProjectManager manager : managers){
                    if(manager.getUsername().equals(username) && manager.getPassword().equals(pw)) {
                        projectManagerMenu(manager);
                        loggedIn = true;
                        break;
                    }
                }
                break;
            case 3:
                for(Guest guest : guests){
                    if(guest.getUsername().equals(username) && guest.getPassword().equals(pw)) {
                        guestMenu(guest);
                        loggedIn = true;
                        break;
                    }
                }
                break;
            case 4:
                for(BoardMember boardMember : boardMembers){
                    if(boardMember.getUsername().equals(username) && boardMember.getPassword().equals(pw)) {
                        boardMemberMenu(boardMember);
                        loggedIn = true;
                        break;
                    }
                }

                break;
            case 5:
                for(ProjectMember member : members){
                    if(member.getUsername().equals(username) && member.getPassword().equals(pw)) {
                        memberMenu(member);
                        loggedIn = true;
                        break;
                    }
                }
                break;
            default:
                System.out.println("Redirecting to main menu.");

        }
        if(!loggedIn)
            System.out.println("Wrong ID or Password.");
    }

    public static void adminMenu(Admin admin){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, " + admin.getFullname() + ".\n" );
        int opt;

        do {
            System.out.println("1- Create Project");
            System.out.println("2- Create Issue");
            System.out.println("3- Create User");
            System.out.println("4- Logout");

            opt = input.nextInt();  input.nextLine();

            if (opt == 1) {
                admin.createEmptyProject();
            } else if (opt == 2) {
                admin.createIssue();
            } else if (opt == 3) {
                admin.createUser();
            } else if (opt == 4) {
                System.out.println("Good Bye..");
                return;
            }
        }while(opt!=4);
    }

    public static void projectManagerMenu(ProjectManager projectManager){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, " + projectManager.getFullname() + ".\n" );
        int opt;

        do {
            System.out.println("1- Assign User");
            System.out.println("4- Logout");

            opt = input.nextInt();  input.nextLine();

            if (opt == 1) {
                projectManager.createEmptyProject();
            } else if (opt == 2) {
                admin.createIssue();
            } else if (opt == 3) {
                admin.createUser();
            } else if (opt == 4) {
                System.out.println("Good Bye..");
                return;
            }
        }while(opt!=4);
    }

    public static void boardMemberMenu(BoardMember boardMember){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, " + boardMember.getFullname() + ".\n" );
        int opt;

        do {
            System.out.println("1- Assign User");
            System.out.println("4- Logout");

            opt = input.nextInt();  input.nextLine();

            if (opt == 1) {
                projectManager.createEmptyProject();
            } else if (opt == 2) {
                admin.createIssue();
            } else if (opt == 3) {
                admin.createUser();
            } else if (opt == 4) {
                System.out.println("Good Bye..");
                return;
            }
        }while(opt!=4);
    }

    public static void guestMenu(Guest guest){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, " + guest.getFullname() + ".\n" );
        int opt;

        do {
            System.out.println("1- Assign User");
            System.out.println("4- Logout");

            opt = input.nextInt();  input.nextLine();

            if (opt == 1) {
                projectManager.createEmptyProject();
            } else if (opt == 2) {
                admin.createIssue();
            } else if (opt == 3) {
                admin.createUser();
            } else if (opt == 4) {
                System.out.println("Good Bye..");
                return;
            }
        }while(opt!=4);
    }

    public static void memberMenu(ProjectMember projectMember){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, " + projectMember.getFullname() + ".\n" );
        int opt;

        do {
            System.out.println("1- Assign User");
            System.out.println("4- Logout");

            opt = input.nextInt();  input.nextLine();

            if (opt == 1) {
                projectManager.createEmptyProject();
            } else if (opt == 2) {
                admin.createIssue();
            } else if (opt == 3) {
                admin.createUser();
            } else if (opt == 4) {
                System.out.println("Good Bye..");
                return;
            }
        }while(opt!=4);
    }
}

s