import java.util.Comparator;
public class SortByCreateDate implements Comparator<Issue> {
    public int compare(Issue a, Issue b)
    {
        return a.getCreateDate().compareTo(b.getCreateDate());
    }
    
}