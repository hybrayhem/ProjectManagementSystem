import java.util.ArrayList;
import java.util.Comparator;

/** Implements the quicksort algorithm. */
public class QuickSort {
    /**
     * Sorts the given issues by due date
     * @param issueList list of issues to be sorted
     * @return returns the arraylist of sorted issues
     */
    public static ArrayList<Issue> sortByDueDate(IssueList issuelist){
        if(issuelist == null){
            return null;
        }
        Issue[] issuesArr = new Issue[issuelist.getIssueList().size()];
        for(int i = 0; i < issuelist.getIssueList().size();i++){
            issuesArr[i] = issuelist.getIssueList().get(i);
        }
        QuickSort.sort(issuesArr,new SortByDueDate());
        ArrayList<Issue> arrListIssues = new ArrayList<>();
        for(int i = 0; i < issuelist.getIssueList().size();i++){
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
        if(issuelist == null){
            return null;
        }
        Issue[] issuesArr = new Issue[issuelist.getIssueList().size()];
        for(int i = 0; i < issuelist.getIssueList().size();i++){
            issuesArr[i] = issuelist.getIssueList().get(i);
        }
        QuickSort.sort(issuesArr,new SortByCreateDate());
        ArrayList<Issue> arrListIssues = new ArrayList<>();
        for(int i = 0; i < issuelist.getIssueList().size();i++){
            arrListIssues.add(issuesArr[i]);
        }
        return arrListIssues;  
    }
    /** Sort the table using the quicksort algorithm.
    @pre table contains Comparable objects.
    @post table is sorted.
    @param table The array to be sorted
    */
    public static void sort(Issue[] table, Comparator<Issue> comp) {
    // Sort the whole table.
        quickSort(table, 0, table.length - 1,comp);
    }
    
    /** Sort a part of the table using the quicksort algorithm.
    @post The part of table from first through last is sorted.
    @param table The array to be sorted
    @param first The index of the low bound
    @param last The index of the high bound
    */
    private static void quickSort(Issue[] table, int first, int last,Comparator<Issue> comp) {
        if (first < last) { // There is data to be sorted.
            // Partition the table.
            int pivIndex = partition(table, first, last,comp);
            // Sort the left half.
            quickSort(table, first, pivIndex - 1,comp);
            // Sort the right half.
            quickSort(table, pivIndex + 1, last,comp);
        }
    }
    /** Partition the table so that values from first to pivIndex
     are less than or equal to the pivot value, and values from
     pivIndex to last are greater than the pivot value.
     @param table The table to be partitioned
     @param first The index of the low bound
     @param last The index of the high bound
     @return The location of the pivot value
    */
    private static int partition(Issue[] table, int first, int last,Comparator<Issue> comp) {
        // Select the first item as the pivot value.
        Issue pivot = table[first];
        int up = first;
        int down = last;
        do {
            /* Invariant:
            All items in table[first . . . up ‐ 1] <= pivot
            All items in table[down + 1 . . . last] > pivot
            */
            while ((up < last) && (comp.compare(pivot,(table[up])) >= 0)) {
                up++; 
            }
            // assert: up equals last or table[up] > pivot.
            while (comp.compare(pivot,(table[down])) < 0) {
                down--;
            }
            // assert: down equals first or table[down] <= pivot.
            if (up < down) { // if up is to the left of down.
                // Exchange table[up] and table[down].
                swap(table, up, down);
            }
        } while (up < down); // Repeat while up is left of down.
        // Exchange table[first] and table[down] thus putting the
        // pivot value where it belongs.
        swap(table, first, down);
        // Return the index of the pivot value.
        return down;
    }
    private static void swap(Issue[] arr, int first, int second){
        Issue temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
