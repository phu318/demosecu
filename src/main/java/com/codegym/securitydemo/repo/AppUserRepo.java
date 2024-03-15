package com.codegym.securitydemo.repo;

import com.codegym.securitydemo.model.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface AppUserRepo extends CrudRepository<AppUser, Long> {
AppUser findByName(String username);
}
