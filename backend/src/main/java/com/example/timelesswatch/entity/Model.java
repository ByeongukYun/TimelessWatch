package com.example.timelesswatch.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 모델 id

    @Column(unique = true, nullable = false)
    private String referenceNo; // 브랜드 자체 모델번호

    @Enumerated(EnumType.STRING) // 같은 패키지이므로 import 불필요
    private MovementType movementType;  // 무브먼트 종류

    private String movement; // 무브먼트 모델

    @Column(precision = 4, scale = 1, nullable = false)
    private BigDecimal caseDiameter; // 케이스 지름

    @Column(precision = 4, scale = 1, nullable = false)
    private BigDecimal caseThickness; // 두께

    @Enumerated(EnumType.STRING)
    private Glass glass; // 글래스 종류

    @Column(precision = 4, scale = 1, nullable = false)
    private BigDecimal lugToLug; // 러그 투 러그 (mm)

    @Column(precision = 4, scale = 1, nullable = false)
    private BigDecimal lugSize; // 러그 너비 (mm)

    @Enumerated(EnumType.STRING)
    private DialColor dialColor; // 다이얼 색상

    private Integer waterResist; // 방수 등급 (m)




    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collection_id")
    private Collection collection;  // FK 컬럼명 명시
}
