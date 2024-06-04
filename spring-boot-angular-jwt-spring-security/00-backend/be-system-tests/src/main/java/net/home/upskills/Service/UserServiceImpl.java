package net.home.upskills.Service;

import net.home.upskills.Entity.User;
import net.home.upskills.Entity.UserRole;
import net.home.upskills.Repository.RoleRepository;
import net.home.upskills.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User saveUser(User user, Set<UserRole> userRoles) throws Exception {
        User localUser = userRepository.findByUserName(user.getUserName());
        if(localUser != null) {
            System.out.println("User already exists!!!!");
            throw new Exception("User already exists!!!");
        } else {
            for(UserRole userRole: userRoles) {
                roleRepository.save(userRole.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            localUser = userRepository.save(user);
        }
        return localUser;
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUserName(username);
    }

    @Override
    public void deleteUser(Long userid) {
        userRepository.deleteById(userid);
    }
}
