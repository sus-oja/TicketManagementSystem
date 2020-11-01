package model;

import javax.persistence.*;

@Entity
@Table(schema = "Theatre", name = "Shows")
public class Shows {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //behavior of field in SQL

    @Column(name = "Title")
    private String title;

    @Column(name = "Description")
    private String description;

    @Column(name = "Duration")
    private String duration;

    @Column(name = "Type")
    private String type;

    @Column(name = "Director")
    private String director;

    public Shows(String title, String description, String duration, String type, String director) {
        this.director = director;
        this.duration = duration;
        this.description = description;
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}

