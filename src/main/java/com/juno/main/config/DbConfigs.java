package com.juno.main.config;

import com.juno.main.entity.User;
import com.juno.main.repository.UserRepository;
import org.hibernate.usertype.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class DbConfigs {

    @Autowired
    private UserRepository userRepository;

    @Bean
    public User createUSer() {
        return initDb();
    }

    private User initDb() {
        User user = new User();
       // user.setUserType(UserType.STUDENT);
        user.setUserName("PeterM");
        user.setPassword("ABC123abc*");
        user.setDateofBirth(new Date());
        user.setCreationTime(new Date());
        userRepository.save(user);

        return user;
    }

}
