package com.example.demo.domain.restaurant.domain;

import com.example.demo.global.common.BaseTime;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "restaurant")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Builder
public class Restaurant extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    // 레스토랑명
    @NotNull
    @Column(name = "name")
    private String name;

    // 레스토랑 카테고리
    @NotNull
    @Column(name = "category")
    private String category;
}
