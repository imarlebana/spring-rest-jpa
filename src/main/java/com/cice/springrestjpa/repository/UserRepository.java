package com.cice.springrestjpa.repository;

import com.cice.springrestjpa.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findAllByUserAndAndPass(String user, String pass);
}
