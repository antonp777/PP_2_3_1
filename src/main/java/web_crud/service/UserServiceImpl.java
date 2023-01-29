package web_crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web_crud.dao.UserDAO;
import web_crud.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserDAO userDAO;
    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public List<User> showUsers() {
        return userDAO.showUsers();
    }

    @Override
    @Transactional
    public User showUser(int id) {
        return userDAO.showUser(id);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public void updateUser(int id, User user) {
        userDAO.updateUser(id, user);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
