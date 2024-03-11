package org.vdoloka.uax.repository.entity;

import jakarta.persistence.*;
    @Entity
    @Table(name = "users")
    public class User  {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "username", nullable = false, unique = true)
        private String username;
        @Column(name = "email", nullable = false, unique = true)
        private String email;
        @Column(name = "password", nullable = false)
        private String password;
}
