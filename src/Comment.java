import java.util.Date;
import java.util.Calendar;

public class Comment {

    private int id;
    private User owner;
    private String data;
    private Date creationDate;

    public Comment(int id, User owner, String data) {
        Calendar c = Calendar.getInstance();
        this.id = id;
        this.owner = owner;
        this.data = data;
        this.creationDate = c.getTime();
    }

    public int getId() {
        return id;
    }

    public User getOwner() {
        return owner;
    }

    public String getData() {
        return data;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
