package com.example.lab1.repo;

import com.example.lab1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

    @Query("select u from User u where u.posts.size >= :num")
    public List<User> findUserWithPosts(int num);


    User findByUserName(String username);

    User findByEmail(String username);
}
