import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Issue {

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

    public List<User> assignee;
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

    public List<Comment> getComments(){
        return comments;
    }

    public List<User> getAssignees(){
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
        int id = 0;
        //id = generateId();
        Comment com = new Comment(id, user, line);
        comments.add(com);
    }

    public void removeComment(Comment com){
        comments.remove(com);
    }

    public void addAssignee(User user){
        assignee.add(user);
    }

    public void removeAssignee(User user){
        assignee.remove(user);
    }
}
