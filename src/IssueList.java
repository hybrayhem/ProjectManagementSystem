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

    public boolean addIssue(Issue i){
        if(i == null)
            return false;
        issues.add(i);
        issueQueue.add(i);
        return true;
    }

    public boolean deleteIssue(Issue i){
        if(i == null)
            return false;
        issues.remove(i);
        issueQueue.remove(i);
        return true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Issue searchInIssueList(String title){
        for(int i = 0; i < issues.size(); i++) {
            if (title.compareTo(issues.get(i).getTitle()) == 0) {
                return issues.get(i);
            }
        }
        return null;
    }
}
