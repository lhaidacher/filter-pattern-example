package at.lh.filterpatternexample.repository;

import at.lh.filterpatternexample.domain.User;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserRepositoryImpl implements UserRepository {
    private static final Set<User> users = new HashSet<>();

    static {
        Faker faker = Faker.instance();
        users.add(User.builder()
                .userName("ruthe.schroeder")
                .mail("cqkz34@gmail.com")
                .firstName("Branson")
                .lastName("Bartoletti")
                .build());

        users.add(User.builder()
                .userName("bria.bednar")
                .mail("mztq83@gmail.com")
                .firstName("Angelica")
                .lastName("Schulist")
                .build());

        users.add(User.builder()
                .userName("ashlynn.hudson")
                .mail("bvdo35@gmail.com")
                .firstName("Aniya")
                .lastName("Braun")
                .build());

        users.add(User.builder()
                .userName("gia.price")
                .mail("npvw32@gmail.com")
                .firstName("Armando")
                .lastName("Durgan")
                .build());

        users.forEach(System.out::println);
    }


    @Override
    public Set<User> findByKeyword(String keyword) {
        return users.stream().filter(user -> user.filter(keyword)).collect(Collectors.toSet());
    }

    @Override
    public Set<User> findByFirstName(String firstName) {
        return users.stream().filter(user -> user.getFirstName().contains(firstName)).collect(Collectors.toSet());
    }
}
