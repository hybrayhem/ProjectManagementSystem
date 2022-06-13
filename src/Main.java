import java.io.FileNotFoundException;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("*** GTU PROJECT MANAGEMENT AND PLANNING SYSTEM ***");
        SystemClass system = new SystemClass();


        if (!system.login()){
            System.out.println("Good Bye..");
            return;
        }

        System.out.println("1- Create Project");
        System.out.println("2- Edit Project");
        System.out.println("3- Logout");
        System.out.println("4- Create Project");



    }
}