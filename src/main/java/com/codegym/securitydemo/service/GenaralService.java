package com.codegym.securitydemo.service;

import java.util.Optional;

public interface GenaralService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(T t);

    void remove(Long id);
}
