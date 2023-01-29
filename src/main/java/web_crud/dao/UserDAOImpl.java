package web_crud.dao;

import org.springframework.stereotype.Repository;
import web_crud.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> showUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public User showUser(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(int id, User user) {
       User userUpdate = entityManager.find(User.class, id);
       userUpdate.setName(user.getName());
       userUpdate.setSername(user.getSername());
       userUpdate.setAge(user.getAge());
    }

    @Override
    public void deleteUser(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}
