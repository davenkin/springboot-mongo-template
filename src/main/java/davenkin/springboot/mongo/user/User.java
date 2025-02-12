package davenkin.springboot.mongo.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import static lombok.AccessLevel.PRIVATE;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;


@Getter
@Document("user")
@TypeAlias("User")
@NoArgsConstructor(access = PRIVATE)
public class User {
    @Id
    private String id;
    private String name;

    public User(String name) {
        this.id = randomAlphabetic(10);
        this.name = name;
    }
}
