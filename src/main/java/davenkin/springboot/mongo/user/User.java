package davenkin.springboot.mongo.user;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

@Getter
@Document(collection = "user")
public class User {
    @Id
    private String id;
    private final String name;

    public User(String name) {
        this.id = randomAlphabetic(10);
        this.name = name;
    }
}
