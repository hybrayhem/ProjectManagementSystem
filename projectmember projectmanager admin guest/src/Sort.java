import java.util.ArrayList;

public class Sort {
    /**
     * Sorts the given issue
     */
    public static ArrayList<Issue> sortByDueDate(IssueList issuelist){
        Issue[] issuesArr = new Issue[issuelist.size()];
        for(int i = 0; i < issuelist.size();i++){
            issuesArr[i] = issuelist.get(i);
        }
        QuickSort.sort(issuesArr,new SortByDueDate());
        ArrayList<Issue> arrListIssues = new ArrayList<>();
        for(int i = 0; i < issuelist.size();i++){
            arrListIssues.add(issuesArr[i]);
        }
        return arrListIssues;      
    }
    public static ArrayList<Issue> sortByCreateDate(IssueList issuelist){
        Issue[] issuesArr = new Issue[issuelist.size()];
        for(int i = 0; i < issuelist.size();i++){
            issuesArr[i] = issuelist.get(i);
        }
        QuickSort.sort(issuesArr,new sortByCreateDate());
        ArrayList<Issue> arrListIssues = new ArrayList<>();
        for(int i = 0; i < issuelist.size();i++){
            arrListIssues.add(issuesArr[i]);
        }
        return arrListIssues;  
    }
}
