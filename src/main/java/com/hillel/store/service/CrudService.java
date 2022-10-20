package com.hillel.store.service;

import java.util.List;

public interface CrudService<T> {

    T create(T object);

    List<T> getAll();

    T getById(Integer id);

    T updateById(Integer id, T object);

    void removeById(Integer id);

}
