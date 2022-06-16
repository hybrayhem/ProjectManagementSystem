package ProjectManagementSystem;

import java.util.Stack;
import java.io.Serializable;
import java.util.Objects;

public class Backlog implements Serializable {
    private Stack<Issue> issues = new Stack<>();

    public Backlog() {
        // Intentionally left empty
    }

    public Backlog(Stack<Issue> issues) {
        this.issues = issues;
    }


    /**
     * @param issue
     */
    public void addIssue(Issue issue) {
        issues.push(issue);
    }


    /**
     * @param issue
     */
    public void removeIssue(Issue issue) {
        issues.remove(issue);
    }

    public void removeLastIssue() {
        issues.pop();
    }


    /**
     * @return Issue
     */
    public Issue getTopIssue() {
        return issues.peek();
    }


    /**
     * @return Stack<Issue>
     */
    public Stack<Issue> getIssues() {
        return this.issues;
    }


    /**
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Backlog)) {
            return false;
        }
        Backlog backlog = (Backlog) o;
        return Objects.equals(issues, backlog.issues);
    }


    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(issues);
    }


    /**
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder issuesSb = new StringBuilder();
        for(Issue issue : getIssues()) {
            issuesSb.append(issue.toString() + "\n");
        }
        return "\n" + "*".repeat(38) + "  Backlog  " + "*".repeat(39) + "\n" +
                String.format("%-3s %-20s %-12s %-8s %-11s %-20s %-20s", "ID", "Title", "Status", "Priority", "Due Date", "Description", "Comments") + "\n" +
                 issuesSb +
                "*".repeat(88) + "\n";
    }


}