package web_crud.dao;

import web_crud.model.User;

import java.util.List;


public interface UserDAO {
    public List<User> showUsers();

    public User showUser(int id);

    public void saveUser(User user);

    public void updateUser(int id, User user);

    public void deleteUser(int id);
}
