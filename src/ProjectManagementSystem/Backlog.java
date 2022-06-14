package ProjectManagementSystem;

import java.util.Stack;
import java.util.Objects;

public class Backlog {
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
        // TODO: refactor according to menu design
        return "{" +
                " issues='" + getIssues() + "'" +
                "}";
    }

}