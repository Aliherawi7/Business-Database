package com.herawi.database.repositorie;

import com.herawi.database.model.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserApp, Long> {
}
