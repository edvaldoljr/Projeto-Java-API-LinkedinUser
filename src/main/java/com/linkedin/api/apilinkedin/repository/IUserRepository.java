package com.linkedin.api.apilinkedin.repository;

import com.linkedin.api.apilinkedin.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<Users, Long> {
}
