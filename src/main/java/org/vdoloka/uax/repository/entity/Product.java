package org.vdoloka.uax.repository.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "category")
    private String category;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
