package com.jwt.employeeportal.config;

import com.jwt.employeeportal.model.User;
import com.jwt.employeeportal.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {
    // This method is used to create a test user with encrypted password
    @Bean
    public CommandLineRunner demoData(UserRepository userRepo, PasswordEncoder encoder) {
        return args -> {
            if (userRepo.findByEmail("john@example.com").isEmpty()) {
                User user = new User();
                user.setEmail("john@example.com");
                user.setPassword(encoder.encode("password123")); // encrypt password!
                user.setRole("USER");
                userRepo.save(user);
                System.out.println("Test user created: john@example.com / password123");
            }
        };
    }
}
