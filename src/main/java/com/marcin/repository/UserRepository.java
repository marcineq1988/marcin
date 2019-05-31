package com.marcin.repository;

import com.marcin.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByLogin(String login);

    User findUserByLogin(String login);

    User getByLogin(String login);
}
