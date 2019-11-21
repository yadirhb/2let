package edu.mum.cs.waa.domain;
import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.persistence.*;
import java.util.List;
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String code;
    private String description;
    private Status status;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    @OneToMany(mappedBy="category",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Item> items;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
