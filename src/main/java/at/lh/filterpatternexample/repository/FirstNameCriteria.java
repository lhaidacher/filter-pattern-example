package at.lh.filterpatternexample.repository;

import at.lh.filterpatternexample.domain.User;

import java.util.Set;

public class FirstNameCriteria extends Criteria {
    private String firstName;

    public FirstNameCriteria(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public Set<User> get(UserRepository repository) {
        return repository.findByFirstName(firstName);
    }
}
