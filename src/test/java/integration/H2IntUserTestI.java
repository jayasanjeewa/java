package integration;

import com.juno.main.Application;
import com.juno.main.entity.User;
import com.juno.main.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = Application.class)
public class H2IntUserTestI {
    @Autowired
    private UserRepository userRepository;

    @Test
    @DisplayName("Create User Test ")
    void createUserTest() {

        User created = userRepository.save(getUser());

        assertTrue(created != null);
    }

    private User getUser() {

        User user = new User();
        user.setUserName("PeterM");
        user.setPassword("ABC123abc*");
        user.setDateofBirth(new Date());
        user.setCreationTime(new Date());

        return user;
    }
}
