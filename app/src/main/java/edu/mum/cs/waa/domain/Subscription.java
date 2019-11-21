package edu.mum.cs.waa.domain;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private SubscriptionType type;

    @OneToOne(cascade = CascadeType.ALL)
    private User member;

    @Valid
    public User getMember() {
        return member;
    }

    public void setMember(User member) {
        this.member = member;
    }

    public Subscription() {
        super();
        this.member = new User();
    }

    public Subscription(SubscriptionType type){
        this();
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SubscriptionType getType() {
        return type;
    }

    public void setType(SubscriptionType type) {
        this.type = type;
    }
}
