package com.example.baeldung.spring_angular_baeldung.repository;

import com.example.baeldung.spring_angular_baeldung.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}

