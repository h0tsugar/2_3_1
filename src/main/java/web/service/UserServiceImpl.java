package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;

import web.model.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }
    @Transactional
    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }
    @Transactional
    @Override
    public void update(User user) {
        userDao.update(user);
    }
    @Transactional
    @Override
    public void delete(User user) {
        userDao.delete(user);
    }
    @Transactional
    @Override
    public User deleteUserById(Long id) {
        return userDao.deleteUserById(id);
    }
}