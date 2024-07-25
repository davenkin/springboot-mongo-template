package davenkin.springboot.mongo.template.helloworld;

import davenkin.springboot.mongo.template.user.User;
import davenkin.springboot.mongo.template.user.UserApplicationService;
import davenkin.springboot.mongo.template.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HelloWorldControllerTest {
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