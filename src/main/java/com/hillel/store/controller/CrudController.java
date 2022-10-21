package com.hillel.store.controller;

import java.util.List;

public interface CrudController<T> {

    T create(T object);

    List<T> getAll();

    T getById(Integer id);

    T updateById(Integer id, T object);

    void removeById(Integer id);
}
