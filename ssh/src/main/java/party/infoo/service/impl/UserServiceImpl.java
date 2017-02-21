package party.infoo.service.impl;

import org.springframework.stereotype.Service;
import party.infoo.dao.UserDao;
import party.infoo.entity.Book;
import party.infoo.entity.Message;
import party.infoo.entity.User;
import party.infoo.service.UserService;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by infoo on 2017/2/21.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User loginUser(User user) {
        return userDao.loginUser(user);
    }

    @Override
    public User registerUser(User user) {
        return userDao.registerUser(user);
    }

    @Override
    public User getUser(Class<User> c, Serializable id) {
        return userDao.getUser(c,id);
    }

    @Override
    public void updateUser(User user, User newUser) {
        if (user.getUserId() == newUser.getUserId())
            userDao.updateUser(newUser);
    }

    @Override
    public void addFriend(User user, User friend) {
        userDao.addFriend(user, friend);
    }

    @Override
    public void deleteFriend(User user, User friend) {
        userDao.deleteFriend(user, friend);
    }

    @Override
    public void addBuyBook(User user, Book book) {
        userDao.addBuyBook(user, book);
    }

    @Override
    public void addLoveBook(User user, Book book) {
        userDao.addLoveBook(user, book);
    }

    @Override
    public void deleteLoveBook(User user, Book book) {
        userDao.deleteLoveBook(user, book);
    }

    @Override
    public void addBorrowBook(User user, Book book) {
        userDao.addBorrowBook(user, book);
    }

    @Override
    public void deleteBorrowBook(User user, Book book) {
        userDao.deleteBorrowBook(user, book);
    }

    @Override
    public void getReceiveMessages(User user) {
        userDao.getReceiveMessages(user);
    }

    @Override
    public void getSendMessages(User user) {
        userDao.getSendMessages(user);
    }

    @Override
    public void deleteReceiveMessage(User user, Message message) {
        userDao.deleteReceiveMessage(user, message);
    }

    @Override
    public void deleteReceiveMessages(User user, List<Message> messages) {
        userDao.deleteReceiveMessages(user, messages);
    }

    @Override
    public void deleteSendMessage(User user, Message message) {
        userDao.deleteSendMessage(user, message);
    }

    @Override
    public void deleteSendMessages(User user, List<Message> messages) {
        userDao.deleteSendMessages(user, messages);
    }

    @Override
    public void readMessage(User user, Message message) {
        userDao.readMessage(user, message);
    }
}
