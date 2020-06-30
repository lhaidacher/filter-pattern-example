package at.lh.filterpatternexample.service.impl;

import at.lh.filterpatternexample.controller.UserFilter;
import at.lh.filterpatternexample.domain.User;
import at.lh.filterpatternexample.repository.UserRepository;
import at.lh.filterpatternexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> get(UserFilter filter) {
        return filter.getCriteria().get(repository).stream()
                .sorted(Comparator.comparing(User::getUserName))
                .collect(Collectors.toList());
    }
}
