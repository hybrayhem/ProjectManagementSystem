import java.util.ArrayList;

public class Sort {
    /**
     * Sorts the given issues by due date
     * @param issueList list of issues to be sorted
     * @return returns the arraylist of sorted issues
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
    /**
     * sort the given issues by create date
     * @param issueList list of issues to be sorted
     * @return returns the arraylist of sorted issues
     */
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
