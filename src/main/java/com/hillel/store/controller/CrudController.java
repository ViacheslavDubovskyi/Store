package com.hillel.store.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

public interface CrudController<T> {

    @ResponseStatus(HttpStatus.CREATED)
    T create(T object);

    @ResponseStatus(HttpStatus.OK)
    List<T> getAll();

    @ResponseStatus(HttpStatus.OK)
    T getById(Integer id);

    @ResponseStatus(HttpStatus.OK)
    T updateById(Integer id, T object);

    @ResponseStatus(HttpStatus.NO_CONTENT)
    void removeById(Integer id);
}
