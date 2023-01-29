package web_crud.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web_crud.model.User;

import java.util.List;


public interface UserService {
    public List<User> showUsers();
    public User showUser(int id);

    public void saveUser(User user);

    public void updateUser(int id, User user);

    public void deleteUser(int id);
}
