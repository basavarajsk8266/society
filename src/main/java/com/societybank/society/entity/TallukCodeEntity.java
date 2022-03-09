package com.societybank.society.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "tallukcode")
public class TallukCodeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tallukcode_id", nullable = false)
    private Integer id;

    @Column(name = "code", nullable = false)
    private Integer code;

    @Column(name = "talluk", nullable = false, length = 20)
    private String talluk;

    @Column(name = "district", nullable = false, length = 20)
    private String district;


}