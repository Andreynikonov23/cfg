package ru.sapteh.model;

import ru.sapteh.dao.TourPackage;
import ru.sapteh.dao.daolmpl.DaoPack;

public class SessionPackage implements DaoPack<TourPackage, Integer> {
    private
    @Override
    public void create(TourPackage tourPackage) {
        try ()
    }

    @Override
    public TourPackage read(Integer integer) {
        return null;
    }

    @Override
    public void update(TourPackage tourPackage) {

    }

    @Override
    public void delete(TourPackage tourPackage) {

    }
}
