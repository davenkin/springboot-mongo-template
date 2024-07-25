package davenkin.springboot.mongo.template.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class UserApplicationService {
    private final UserRepository userRepository;

    @Transactional
    public String createUser(String name) {
        User user = new User(name);
        userRepository.save(user);
        return user.getId();
    }
}
