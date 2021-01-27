package ru.sapteh.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.sapteh.dao.TourOper;
import ru.sapteh.dao.daolmpl.DaoOper;

public class SessionOper implements DaoOper<TourOper, Integer> {
    private SessionFactory factory;
    public SessionOper(SessionFactory factory) {
        this.factory = factory;
    }
    @Override
    public void create(TourOper tourOper) {
    try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.save(tourOper);
            session.getTransaction().commit();
        }
    }
}
