package com.codegym.securitydemo.repo;

import com.codegym.securitydemo.model.AppRole;
import org.springframework.data.repository.CrudRepository;

public interface AppRoleRepo extends CrudRepository<AppRole, Long> {
}
