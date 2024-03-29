package roast.rest;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Represents a knowledge entry item.
 *
 * @author Andreas Willinger
 * @version 1.0
 */
@Entity
@NamedQueries({
       @NamedQuery(name = "getItemById", query = "FROM Item i WHERE i.id = :id")
})
public class Item
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @NotNull
    private String title;
    @NotNull
    @Column(columnDefinition = "text", length = 65536)
    private String content;
    @NotNull
    private Date timestamp;

    public Item() {}

    public Item(Integer id, String title, String content, Date timestamp)
    {
        this.id = id;
        this.title = title;
        this.content = content;
        this.timestamp = timestamp;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public Date getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(Date timestamp)
    {
        this.timestamp = timestamp;
    }
}