import java.util.Comparator;
public class SortByCreateTime implements Comparator<Issue> {
    public int compare(Issue a, Issue b)
    {
        return a.getCreateTime().compareTo(b.getCreateTime());;
    }
}