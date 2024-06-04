package net.home.upskills.Repository;

import net.home.upskills.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByUserName(String userName);
}
