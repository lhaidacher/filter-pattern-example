package at.lh.filterpatternexample.repository;

import at.lh.filterpatternexample.domain.User;

import java.util.Set;

public abstract class Criteria {
    public abstract Set<User> get(UserRepository repository);
}
