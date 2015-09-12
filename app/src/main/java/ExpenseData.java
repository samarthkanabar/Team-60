import java.sql.Date;

/**
 * Created by Kshitij on 9/12/2015.
 */

public class ExpenseData {
    private long id;
    private Date date;
    private String category;
    private String note;

    public long getId() {
        return id;
    }
    public Date getDate()   {
        return date;
    }
    public String getCategory() {
        return category;
    }
    public String getNote() {
        return note;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setDate(Date date)  {
        this.date = date;
    }
    public void setCategory(String category)    {
        this.category = category;
    }
    public void setNote(String note)    {
        this.note = note;
    }

}
