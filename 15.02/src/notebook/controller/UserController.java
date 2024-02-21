package notebook.controller;

import notebook.model.User;
import notebook.view.UserView;
import notebook.model.repository.GBRepository;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class UserController {
    private final GBRepository repository;

    public UserController(GBRepository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.create(user);
    }

    public User readUser(Long userId) throws Exception {
        List<User> users = repository.findAll();
        for (User user : users) {
            if (Objects.equals(user.getId(), userId)) {
                return user;
            }
        }

        throw new RuntimeException("User not found");
    }

    public void updateUser(String userId, User update) {
        update.setId(Long.parseLong(userId));
        repository.update(Long.parseLong(userId), update);
    }

    public void deleteUser(Long userId) {
        List<User> users = repository.findAll();
        boolean userFound = false;

        for (User user : users) {
            if (Objects.equals(user.getId(), userId)) {
                repository.delete(userId);
                userFound = true;
                break;
            }
        }

        if (!userFound) {
            throw new RuntimeException("User not found");
        }
    }
    public User createUser(String firstName, String lastName, String phone) {
        return new User(firstName, lastName, phone);
    }
}
