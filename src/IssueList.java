import java.util.List;
import java.util.PriorityQueue;

public class IssueList {
    private String title;
    private List<Issue> issues;
    private PriorityQueue<Issue> issueQueue;

    public IssueList(String title) {
        this.title = title;
    }


    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    public PriorityQueue<Issue> getIssueQueue() {
        return issueQueue;
    }

    public void setIssueQueue(PriorityQueue<Issue> issueQueue) {
        this.issueQueue = issueQueue;
    }

    public void addIssue(Issue i){
        issues.add(i);
        issueQueue.add(i);
    }

    public void deleteIssue(Issue i){
        issues.remove(i);
        issueQueue.remove(i);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
