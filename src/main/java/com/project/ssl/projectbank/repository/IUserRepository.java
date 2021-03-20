package com.project.ssl.projectbank.repository;

import com.project.ssl.projectbank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {



}
