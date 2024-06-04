package net.home.upskills.Service;

import net.home.upskills.Entity.User;
import net.home.upskills.Entity.UserRole;

import java.util.Set;

public interface UserService {
    public User saveUser(User user, Set<UserRole> userRoles) throws Exception;

    public User getUser(String username);

    public void deleteUser(Long userid);
}
