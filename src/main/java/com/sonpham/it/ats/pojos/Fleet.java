package com.sonpham.it.ats.pojos;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "fleet")
public class Fleet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "stamp")
    private int stamp;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    public Fleet() {

    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getStamp() {
        return stamp;
    }
    public void setStamp(int stamp) {
        this.stamp = stamp;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
