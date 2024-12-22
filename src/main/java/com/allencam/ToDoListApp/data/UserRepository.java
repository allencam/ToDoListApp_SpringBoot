package com.allencam.ToDoListApp.data;

import com.allencam.ToDoListApp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);
    User findByUserId(int userId);

}
