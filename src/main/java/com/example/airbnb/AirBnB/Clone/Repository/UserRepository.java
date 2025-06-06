package com.example.airbnb.AirBnB.Clone.Repository;

import com.example.airbnb.AirBnB.Clone.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {


}
