package com.epam.library.domain.entity;

/**
 * Created by User on 14.03.2017.
 */
public abstract class AbstractEntity<T> {
   protected T id;

    public AbstractEntity(T id) {
        this.id = id;
    }

    public AbstractEntity() {
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractEntity<?> that = (AbstractEntity<?>) o;

        return id.equals(that.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
