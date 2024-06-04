package net.home.upskills;

import net.home.upskills.Entity.Role;
import net.home.upskills.Entity.User;
import net.home.upskills.Entity.UserRole;
import net.home.upskills.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BeSystemTestsApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args)  {
		SpringApplication.run(BeSystemTestsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// try {
//			User user = new User();
//
//			user.setFirstName("Julian");
//			user.setLastName("Mercado");
//			user.setUserName("julmercado");
//			user.setPassWord("12345");
//			user.setEmail("julian@test.com");
//			user.setPhone("8089990011");
//			user.setProfile("profile_pic.png");
//
//			Role role = new Role();
//			role.setRoleId(1L);
//			role.setRoleName("ADMIN");
//
//			Set<UserRole> userRoles = new HashSet<>();
//			UserRole userRole = new UserRole();
//			userRole.setRole(role);
//			userRole.setUser(user);
//			userRoles.add(userRole);
//
//			User savedUser = userService.saveUser(user, userRoles);
//			System.out.println(savedUser.getUserName());
//		} catch(UserFoundException exception) {
//			exception.printStackTrace();
//		}


	}

}
