package edu.mum.cs.waa.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Center {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotEmpty
    @Size(min = 3,max = 50,message = "{Size.Center.name.validation}")
    private String name;
    @NotEmpty
    private String description;
    private Status status;

    @JoinColumn(unique = true)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Category> categories;

    @JoinColumn(unique = true)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<User> users;

    public Center() {
    }

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

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
