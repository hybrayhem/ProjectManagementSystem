package ProjectManagementSystem;

import java.util.Stack;
import java.util.Objects;

public class Backlog {
    private Stack<Issue> issues;

    public Backlog() {
        // Intentionally left empty
    }

    public Backlog(Stack<Issue> issues) {
        this.issues = issues;
    }

    public void addIssue(Issue issue) {
        issues.push(issue);
    }

    public void removeIssue(Issue issue) {
        issues.remove(issue);
    }

    public void removeLastIssue() {
        issues.pop();
    }

    public Issue getTopIssue() {
        return issues.peek();
    }

    public Stack<Issue> getIssues() {
        return this.issues;
    }

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

    @Override
    public int hashCode() {
        return Objects.hashCode(issues);
    }

    @Override
    public String toString() {
        // TODO: refactor according to menu design
        return "{" +
                " issues='" + getIssues() + "'" +
                "}";
    }

}