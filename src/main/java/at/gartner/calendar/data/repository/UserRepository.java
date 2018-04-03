package at.gartner.calendar.data.repository;


import org.springframework.data.repository.CrudRepository;

import at.gartner.calendar.data.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}