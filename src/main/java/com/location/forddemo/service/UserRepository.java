package com.location.forddemo.service;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

public interface  UserRepository extends CrudRepository<User, Long> {
}
