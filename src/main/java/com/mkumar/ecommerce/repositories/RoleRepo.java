package com.mkumar.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mkumar.ecommerce.entites.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

}
