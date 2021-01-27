package ru.sapteh.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.sapteh.dao.daolmpl.DaoOper;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "Туроператор")
public class TourOper implements DaoOper {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "Нзвание")
    private String name;
    @OneToMany
    @JoinColumn (name = "TourPackage_id")
    private Set<TourPackage> packageSet;

    @Override
    public void create(Object o) {

    }
}
