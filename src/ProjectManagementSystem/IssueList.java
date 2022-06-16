package ProjectManagementSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class IssueList implements Serializable {
    private String title;
    private ArrayList<Issue> issues;
    private PriorityQueue<Issue> issueQueue;


    public IssueList(String title) {
        this.title = title;
        issues = new ArrayList<>();
        issueQueue = new PriorityQueue<>();
    }

    public IssueList(ArrayList<Issue> newIssues, String newTitle) {
        issues = newIssues;
        title = newTitle;
    }


    public ArrayList<Issue> getIssues() {
        return issues;
    }

    public PriorityQueue<Issue> getIssueQueue() {
        return issueQueue;
    }

    public void setIssueQueue(PriorityQueue<Issue> issueQueue) {
        this.issueQueue = issueQueue;
    }

    public boolean addIssue(Issue i) {
        if (i == null)
            return false;
        issues.add(i);
        issueQueue.add(i);
        return true;
    }

    public boolean deleteIssue(int id) {
        Issue i = searchInIssueList(id);
        if (i == null)
            return false;
        issues.remove(i);
        issueQueue.remove(i);
        return true;
    }

    public String getTitle() {
        return title;
    }

    public boolean setTitle(String title) {
        if (title.equals(""))
            return false;
        this.title = title;
        return true;
    }

    public Issue searchInIssueList(String title) {
        if (title.equals(""))
            return null;
        for (int i = 0; i < issues.size(); i++) {
            if (title.compareTo(issues.get(i).getTitle()) == 0) {
                return issues.get(i);
            }
        }
        return null;
    }

    public Issue searchInIssueList(int id) {
        if (id <= 0)
            return null;
        for (int i = 0; i < issues.size(); i++) {
            if (issues.get(i).getId() == id) {
                return issues.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder issuesSb = new StringBuilder();
        for (Issue issue : issues) {
            issuesSb.append(issue.toString() + "\n");
        }
        return String.format("\n\n%-3s %-20s %-12s %-8s %-11s %-20s %-20s", "ID", "Title", "Status", "Priority", "Due Date", "Description", "Comments") + "\n" +
                "-".repeat(88) + "\n" +
                issuesSb + "\n";
    }

    // Overload for external Issue Lists
    public String toString(List<Issue> issues) {
        StringBuilder issuesSb = new StringBuilder();
        for (Issue issue : issues) {
            issuesSb.append(issue.toString() + "\n");
        }

        return String.format("\n%s %s %s %s %s\n", "*".repeat(36), " ".repeat((14 - getTitle().length())/2),
                             getTitle(),
                             " ".repeat((14 - getTitle().length())/2), "*".repeat(36)) +
                String.format("\n%-3s %-20s %-12s %-8s %-11s %-20s %-20s", "ID", "Title", "Status", "Priority", "Due Date", "Description", "Comments") + "\n" +
                "-".repeat(88) + "\n" +
                issuesSb +
                "\n" + "*".repeat(88) + "\n";
    }
}
