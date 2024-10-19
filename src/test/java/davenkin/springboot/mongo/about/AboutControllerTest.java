package davenkin.springboot.mongo.about;

import davenkin.springboot.mongo.user.User;
import davenkin.springboot.mongo.user.UserApplicationService;
import davenkin.springboot.mongo.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AboutControllerTest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserApplicationService userApplicationService;

    @Test
    void should_create_user() {
        String userId = userApplicationService.createUser("Davenkin");
        User dbUser = userRepository.findById(userId).get();
        assertEquals("Davenkin", dbUser.getName());
    }
}