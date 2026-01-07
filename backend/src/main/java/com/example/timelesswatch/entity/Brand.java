package com.example.timelesswatch.entity;

import jakarta.persistence.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Why Long? not long or int?

    @OneToMany(mappedBy = "brand") // Collection 엔티티에서 brand 필드명 지정
    private List<Collection> collections = new ArrayList<>();

    @Column(unique = true, nullable = false)
    @NotNull
    private String name;

    @Column(length = 300)
    private String url;
}
