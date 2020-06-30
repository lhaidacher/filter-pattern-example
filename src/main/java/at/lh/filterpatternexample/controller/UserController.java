package at.lh.filterpatternexample.controller;

import at.lh.filterpatternexample.domain.User;
import at.lh.filterpatternexample.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Iterable<User> users(@Valid UserFilter filter) {
        return userService.get(filter);
    }
}

