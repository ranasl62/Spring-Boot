package com.example.BillPaymentAdminPanel;

import com.example.BillPaymentAdminPanel.config.SecurityUtility;
import com.example.BillPaymentAdminPanel.domain.Role;
import com.example.BillPaymentAdminPanel.domain.UserRole;
import com.example.BillPaymentAdminPanel.model.Users;
import com.example.BillPaymentAdminPanel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BillPaymentAdminPanelApplication implements CommandLineRunner{

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(BillPaymentAdminPanelApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Users user = new Users();
		user.setName("Md. Mijanur Rahaman");
		user.setUsername("mijan");
		user.setPassword(SecurityUtility.passwordEncoder().encode("ayesha75"));
		user.setCreated_time(new Date());
		user.setCreated_by("mijan");
		user.setStatus(1);
		user.setIs_stakeholder_user("0");

		Set<UserRole> roleSet = new HashSet<>();
		Role role = new Role();
		role.setRoleId(1);
		role.setRole("ROLE_SUPER_ADMIN");
		roleSet.add(new UserRole(user, role));
		userService.createUser(user, roleSet);

		roleSet.clear();

	}

}
