package com.mealmedia.places.repositories;

import com.mealmedia.places.entities.right.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
