package com.example.timelesswatch.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Collection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "brand_id") // 외래키 컬럼 명시
    private Brand brand;
    
    private String name;

    @Column(nullable = true)
    private String url;

    @OneToMany(mappedBy = "collection")  // Model의 collection 필드와 매핑
    private List<Model> models = new ArrayList<>();
}
