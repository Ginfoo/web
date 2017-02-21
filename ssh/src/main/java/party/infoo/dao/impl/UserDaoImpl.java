package party.infoo.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import party.infoo.dao.UserDao;
import party.infoo.entity.Book;
import party.infoo.entity.Message;
import party.infoo.entity.User;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by infoo on 2017/2/21.
 */
@Repository("userDao")  //定义bean
public class UserDaoImpl implements UserDao {
    @Resource    //注入bean
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public User loginUser(User user) {
        Criteria criteria = this.getCurrentSession().createCriteria(User.class);
        Criterion c1 = Restrictions.eq("userName", user.getUserName());
        Criterion c2 = Restrictions.eq("userPass", user.getUserPass());
        criteria.add(c1).add(c2);
        return (User) criteria.uniqueResult();
    }

    @Override
    public User registerUser(User user) {
        Criteria criteria = this.getCurrentSession().createCriteria(User.class);
        Criterion criterion = Restrictions.eq("userName", user.getUserName());
        criteria.add(criterion);
        if (criteria.uniqueResult() == null) {
            this.getCurrentSession().save(user);
            return user;
        } else {
            return null;
        }
    }

    @Override
    public User getUser(Class<User> c, Serializable id) {
        id=Long.valueOf((int)id);
        return (User)this.getCurrentSession().get(c,id);
    }

    @Override
    public void updateUser(User newUser) {
        this.getCurrentSession().update(newUser);
    }

    @Override
    public void addFriend(User user, User friend) {
        user.getUserFriends().add(friend);
    }

    @Override
    public void deleteFriend(User user, User friend) {
        user.getUserFriends().remove(friend);
    }

    @Override
    public void addBuyBook(User user, Book book) {
        user.getUserBuyBooks().add(book);
    }

    @Override
    public void addLoveBook(User user, Book book) {
        user.getUserLoveBooks().add(book);
    }

    @Override
    public void deleteLoveBook(User user, Book book) {
        user.getUserLoveBooks().remove(book);
    }

    @Override
    public void addBorrowBook(User user, Book book) {
        user.getUserBorrowBooks().add(book);
    }

    @Override
    public void deleteBorrowBook(User user, Book book) {
        user.getUserBorrowBooks().remove(book);
    }

    @Override
    public void getReceiveMessages(User user) {

    }

    @Override
    public void getSendMessages(User user) {

    }

    @Override
    public void deleteReceiveMessage(User user, Message message) {

    }

    @Override
    public void deleteReceiveMessages(User user, List<Message> messages) {

    }

    @Override
    public void deleteSendMessage(User user, Message message) {

    }

    @Override
    public void deleteSendMessages(User user, List<Message> messages) {

    }

    @Override
    public void readMessage(User user, Message message) {

    }
}
