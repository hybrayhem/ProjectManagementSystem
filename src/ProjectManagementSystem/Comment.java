package ProjectManagementSystem;

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

    public boolean setId(int id) {
        if(id <= 0)
            return false;
        this.id = id;
        return true;
    }

    public boolean setOwner(User owner) {
        if(owner == null)
            return false;
        this.owner = owner;
        return true;
    }

    public boolean setData(String data) {
        if(data.equals(""))
            return false;
        this.data = data;
        return true;
    }
}
