package ru.sapteh.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "Путевка")
public class TourPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "Нзвание")
    private String number;
    @Column (name = "Дата отправки")
    private String dateSending;
    @Column (name = "Дата возвращения")
    private String dateReturn;
    @OneToMany
    private Set<TourPackage> packageSet;
}
