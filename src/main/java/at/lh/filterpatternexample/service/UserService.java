package at.lh.filterpatternexample.service;

import at.lh.filterpatternexample.controller.UserFilter;
import at.lh.filterpatternexample.domain.User;

import java.util.List;

public interface UserService {
    List<User> get(UserFilter filter);
}
