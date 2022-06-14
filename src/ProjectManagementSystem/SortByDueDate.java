package ProjectManagementSystem;

import java.util.Comparator;
public class SortByDueDate implements Comparator<Issue> {
    public int compare(Issue a, Issue b)
    {
        return a.getDueDate().compareTo(b.getDueDate());
    }
}
