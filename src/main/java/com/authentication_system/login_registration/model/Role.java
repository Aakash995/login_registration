package com.authentication_system.login_registration.model;

import jakarta.persistence.*;

@Entity
@Table(name = "mst_roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getName() {
        return name;
    }
}
