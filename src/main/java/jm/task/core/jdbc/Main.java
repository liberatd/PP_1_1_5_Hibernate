package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Jason", "Statham", (byte) 56);
        userService.saveUser("Oleg", "Vologin", (byte) 26);
        userService.saveUser("Eva", "Elfie", (byte) 26);
        userService.saveUser("Vladimir", "Putin", (byte) 71);
        List<User> userList = userService.getAllUsers();
        userList.forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}