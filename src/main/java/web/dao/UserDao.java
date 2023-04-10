package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> getAllUser();

    void update(User user);

    void delete(User user);

    User deleteUserById(Long id);

}
