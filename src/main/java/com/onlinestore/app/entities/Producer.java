package com.onlinestore.app.entities;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCER")
public class Producer {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCER_SEQ")
    @SequenceGenerator(name="PRODUCER_SEQ", sequenceName="PRODUCER_SEQ", allocationSize=1)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
