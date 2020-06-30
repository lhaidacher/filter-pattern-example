package at.lh.filterpatternexample.repository;

import at.lh.filterpatternexample.domain.User;

import java.util.Set;

public interface UserRepository {
    Set<User> findByKeyword(String keyword);

    Set<User> findByFirstName(String firstName);
}
