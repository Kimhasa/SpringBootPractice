package com.student.noob.entity;

import jakarta.persistence.*;

@Entity
public class Item {
    //@Id = PK 설정, @GeneratedValue = AutoIncrement 자동증가
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    
    //문자 길이 200자로 제한
    @Column(length = 200)
    public String title;
    public Integer price;
}
