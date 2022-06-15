package ProjectManagementSystem;

import java.util.Calendar;
import java.util.Date;
import java.io.Serializable;
import java.util.ArrayList;

public class Issue implements Comparable<Issue>,Serializable {

    public enum Priority{
        Low,
        Medium,
        High
    }
    public enum Status{
        development,
        inProgress,
        inReview,
        verified,
        done
    }
    public enum Type{
        bug,
        task,
        story,
        epic
    }

    private int id;
    private String title;
    private String description;
    private Date createTime;
    private Date updateTime;
    private Date dueDate;
    private Priority priority;
    private Status status;
    private Type type;
    private Issue childIssue;

    public SkipList<User> assignee = new SkipList<User>();
    public ArrayList<String> logHistory = new ArrayList<>();
    private ArrayList<Comment> comments = new ArrayList<>();

    public Issue(int id, String title, Status status, Type type) {
        Calendar c = Calendar.getInstance();
        this.id = id;
        this.title = title;
        this.createTime = c.getTime();
        this.status = status;
        this.type = type;
    }

    @Override
    public int compareTo(Issue o2) {
        Issue o1 = this;
        if((o1.priority == Priority.High && o2.priority == Priority.Low) || (o1.priority == Priority.High && o2.priority == Priority.Medium))
            return 1;
        else if(o1.priority == Priority.Medium && o2.priority == Priority.Low)
            return 1;
        else if((o2.priority == Priority.High && o1.priority == Priority.Low) || (o2.priority == Priority.High && o1.priority == Priority.Medium))
            return -1;
        else if(o2.priority == Priority.Medium && o1.priority == Priority.Low)
            return -1;
        else if((o2.priority == Priority.High && o1.priority == Priority.High) || (o2.priority == Priority.Medium && o1.priority == Priority.Medium)
                || (o2.priority == Priority.Low && o1.priority == Priority.Low))
            return 0;
        else
            return 0;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }

    public Type getType() {
        return type;
    }

    public boolean addChildIssue(Issue i){
        if(i == null)
            return false;
        childIssue = i;
        return true;
    }

    public Issue getChildIssue() {
        return childIssue;
    }

    public Comment getLastComment(){
        if(comments.isEmpty())
            return new Comment(0, null, "");
        return comments.get(comments.size()-1);
    }

    public SkipList<User> getAssignees(){
        return assignee;
    }

    public ArrayList<String> getLogHistory(){
        return logHistory;
    }

    public boolean setTitle(String title) {
        if(title.equals(""))
            return false;
        this.title = title;
        return true;
    }

    public boolean setDescription(String description) {
        if(description.equals(""))
            return false;
        this.description = description;
        return true;
    }

    public void updateUpdateTime() {
        Calendar c = Calendar.getInstance();
        this.updateTime = c.getTime();
    }

    public boolean setDueDate(Date dueDate) {
        Calendar c = Calendar.getInstance();
        if(dueDate.compareTo(c.getTime()) < 1)
            return false;
        this.dueDate = dueDate;
        return true;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean addComment(String line, User user){
        if(user == null || line.equals(""))
            return false;
        int id = getLastComment().getId();
        Comment com = new Comment(id+1, user, line);
        comments.add(com);
        return  true;
    }

    public boolean removeComment(Comment com){
        if(com == null)
            return false;
        comments.remove(com);
        return true;
    }

    public boolean addAssignee(User user){
        if(user == null)
            return false;
        assignee.insert(user);
        return true;
    }

    public boolean removeAssignee(User user){
        if(user == null)
            return false;
        assignee.delete(user);
        return true;
    }

    @Override
    public String toString() {
        String rtrn = Integer.toString(id) + "\n" + description + dueDate.toString() + priority.toString(); //TODO: handle nullPointerException
        return rtrn;
    }
}
