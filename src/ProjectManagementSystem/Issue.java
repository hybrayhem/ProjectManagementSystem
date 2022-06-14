package ProjectManagementSystem;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Issue implements Comparator<Issue> {

    enum Priority{
        Low,
        Medium,
        High
    }
    enum Status{
        development,
        inProgress,
        inReview,
        verified,
        done
    }
    enum Type{
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
    public List<String> logHistory;
    private List<Comment> comments;

    public Issue(int id, String title, Status status, Type type) {
        Calendar c = Calendar.getInstance();
        this.id = id;
        this.title = title;
        this.createTime = c.getTime();
        this.status = status;
        this.type = type;
    }

    @Override
    public int compare(Issue o1, Issue o2) {
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

    public List<String> getLogHistory(){
        return logHistory;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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

    public void addComment(String line, User user){
        int id = getLastComment().getId();
        Comment com = new Comment(id+1, user, line);
        comments.add(com);
    }

    public void removeComment(Comment com){
        comments.remove(com);
    }

    public void addAssignee(User user){
        assignee.insert(user);
    }

    public void removeAssignee(User user){
        assignee.delete(user);
    }

    @Override
    public String toString() {
        String rtrn = Integer.toString(id) + "\n" + description + dueDate.toString() + priority.toString();
        return rtrn;
    }
}
