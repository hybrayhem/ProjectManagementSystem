package test;
import ProjectManagementSystem.Issue;
import ProjectManagementSystem.QuickSort;
import ProjectManagementSystem.Issue.Priority;
import ProjectManagementSystem.IssueList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class QuickSortTests {
    // IssueList class should have constructor IssueList(ArrayList<Issue> newIssues,String newTitle)
    // Issue class should have toString()
    QuickSortTests(){
        // to create time difference between created dates scanner is used
        Scanner scan = new Scanner(System.in);
        ArrayList<Issue> issues = new ArrayList<>();
        int i = 0;
        // date1,date2,date3,date4 and date5 will be dueDates of our issues
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH,11);
        c.set(Calendar.DATE,05);
        c.set(Calendar.YEAR,2222);
        Date date1 = c.getTime();
        Issue issue = new Issue("eray"+i, Issue.Status.development, Issue.Type.task);
        issue.setDueDate(date1);
        issue.setDescription("description");
        issue.setPriority(Priority.High);
        issues.add(issue);
        i++;
        System.out.println("Enter integer value ( needed for quick sort test)");
        scan.nextInt();
        c.set(Calendar.MONTH,12);
        c.set(Calendar.DATE,05);
        c.set(Calendar.YEAR,2233);
        Date date2 = c.getTime();
        issue = new Issue("eray"+i, Issue.Status.development, Issue.Type.task);
        issue.setDueDate(date2);
        issue.setDescription("description");
        issue.setPriority(Priority.High);
        issues.add(issue);
        i++;
        System.out.println("Enter integer value ( needed for quick sort test)");
        scan.nextInt();
        c.set(Calendar.MONTH,01);
        c.set(Calendar.DATE,03);
        c.set(Calendar.YEAR,2244);
        Date date3 = c.getTime();
        issue = new Issue("eray"+i, Issue.Status.development, Issue.Type.task);
        issue.setDueDate(date3);
        issue.setDescription("description");
        issue.setPriority(Priority.High);
        issues.add(issue);
        i++;
        System.out.println("Enter integer value ( needed for quick sort test)");
        scan.nextInt();
        c.set(Calendar.MONTH,02);
        c.set(Calendar.DATE,05);
        c.set(Calendar.YEAR,2255);
        Date date4 = c.getTime();
        issue = new Issue("eray"+i, Issue.Status.development, Issue.Type.task);
        issue.setDueDate(date4);
        issue.setDescription("description");
        issue.setPriority(Priority.High);
        issues.add(issue);
        i++;
        System.out.println("Enter integer value ( needed for quick sort test)");
        scan.nextInt();
        c.set(Calendar.MONTH,8);
        c.set(Calendar.DATE,27);
        c.set(Calendar.YEAR,2266);
        Date date5 = c.getTime();
        issue = new Issue("eray"+i, Issue.Status.development, Issue.Type.task);
        issue.setDueDate(date5);
        issue.setDescription("description");
        issue.setPriority(Priority.High);
        issues.add(issue);
        i++;
        IssueList issueList = new IssueList(issues,"title");
        ArrayList<Issue> sorted = QuickSort.sortByCreateDate(issueList);

        System.out.println("Sorted by create time");
        for(int j = 0 ; j < sorted.size();j++){
            System.out.println(sorted.get(j));
        }
        sorted = QuickSort.sortByDueDate(issueList);
        System.out.println("Sorted by due date");
        for(int j = 0 ; j < sorted.size();j++){
            System.out.println(sorted.get(j));
        }
        System.out.println("What happens if duplicate dates exist:");
        for(int j = 0; j < 3;j++){
            issue = new Issue("eray"+i, Issue.Status.development, Issue.Type.task);
            issue.setDueDate(date5);
            issue.setDescription("description");
            issue.setPriority(Priority.High);
            issues.add(issue);
            i++;
        }
        sorted = QuickSort.sortByCreateDate(issueList);
        System.out.println("Sorted by create time");
        for(int j = 0 ; j < sorted.size();j++){
            System.out.println(sorted.get(j));
        }
        sorted = QuickSort.sortByDueDate(issueList);
        System.out.println("Sorted by due date");
        for(int j = 0 ; j < sorted.size();j++){
            System.out.println(sorted.get(j));
        }
        System.out.println("What happens if null issuelist is given to be sorted");
        IssueList issueList2 = null;
        System.out.println("Sorted by create time");
        System.out.println(QuickSort.sortByCreateDate(issueList2));
        System.out.println("Sorted by due date");
        System.out.println(QuickSort.sortByDueDate(issueList2));
    }
}

