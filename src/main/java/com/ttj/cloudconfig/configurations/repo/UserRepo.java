package com.ttj.cloudconfig.configurations.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ttj.cloudconfig.configurations.entity.UserEntity;
@Repository
public interface UserRepo extends CrudRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);
}