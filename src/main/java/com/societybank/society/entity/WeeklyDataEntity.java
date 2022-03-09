package com.societybank.society.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "weeklydata")
public class WeeklyDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "weeklyData_id", nullable = false)
    private Integer id;

    @Column(name = "weekYear", nullable = false)
    private Integer weekYear;

    @Column(name = "genratedDate", nullable = false)
    private LocalDate genratedDate;

    @Column(name = "subscriberCount", nullable = false)
    private Integer subscriberCount;

    @Column(name = "complementaryCount", nullable = false)
    private Integer complementaryCount;

    @Column(name = "total", nullable = false)
    private Integer total;


}