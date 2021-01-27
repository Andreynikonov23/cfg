package ru.sapteh.dao.daolmpl;

import ru.sapteh.dao.TourOper;

public interface DaoOper<Entity, Key> {
    void create(Entity entity);

    void create(TourOper tourOper);
}
