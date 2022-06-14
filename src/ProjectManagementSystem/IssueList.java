package ProjectManagementSystem;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class IssueList {
    private String title;
    private ArrayList<Issue> issues;
    private PriorityQueue<Issue> issueQueue;

    public IssueList(String title) {
        this.title = title;
        issues = new ArrayList<>();
        issueQueue = new PriorityQueue<>();
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

    public boolean setTitle(String title) {
        if(title.equals(""))
            return false;
        this.title = title;
        return true;
    }

    public Issue searchInIssueList(String title){
        for(int i = 0; i < issues.size(); i++) {
            if (title.compareTo(issues.get(i).getTitle()) == 0) {
                return issues.get(i);
            }
        }
        return null;
    }

    public Issue searchInIssueList(int id){
        for(int i = 0; i < issues.size(); i++) {
            if (issues.get(i).getId() == id) {
                return issues.get(i);
            }
        }
        return null;
    }
}
