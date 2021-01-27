package ru.sapteh.dao.daolmpl;

public interface DaoPack<Entity, Key> {
    void create(Entity entity);
    Entity read (Key key);
    void update(Entity entity);
    void delete(Entity entity);
}
