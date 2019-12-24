package com.onlinestore.app.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "PERSON")
public class Person {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERSON_SEQ")
    @SequenceGenerator(name="PERSON_SEQ", sequenceName="PERSON_SEQ", allocationSize=1)
    @Column(name="ID")
    private Integer id;

    @Column(name="NAME")
    private String name;

    @Column(name="EMAIL")
    private String email;
    private String activationCode;
    private String password;
    private Boolean active;


    @ElementCollection(targetClass = Roles.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "person_roles", joinColumns = @JoinColumn(name = "person_id"))
    @Enumerated(EnumType.STRING)
    private Set<Roles> roles;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Set<Roles> getRoles() {
        return roles;
    }

    public void setRoles(Set<Roles> roles) {
        this.roles = roles;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }
}
