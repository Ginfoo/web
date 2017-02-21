package party.infoo.dao;

import party.infoo.entity.Book;
import party.infoo.entity.Message;
import party.infoo.entity.User;

import java.io.Serializable;
import java.util.List;

/**
 * Created by infoo on 2017/2/21.
 */
public interface UserDao {
    //用户登录
    public User loginUser(User user);

    public User registerUser(User user);

    public User getUser(Class<User> c, Serializable id);

    //修改个人信息
    public void updateUser(User newUser);

    //好友
    public void addFriend(User user, User friend);

    public void deleteFriend(User user, User friend);

    //图书
    public void addBuyBook(User user, Book book);

    public void addLoveBook(User user, Book book);

    public void deleteLoveBook(User user, Book book);

    public void addBorrowBook(User user, Book book);

    public void deleteBorrowBook(User user, Book book);

    //消息
    public void getReceiveMessages(User user);

    public void getSendMessages(User user);

    public void deleteReceiveMessage(User user, Message message);

    public void deleteReceiveMessages(User user, List<Message> messages);

    public void deleteSendMessage(User user, Message message);

    public void deleteSendMessages(User user, List<Message> messages);

    public void readMessage(User user, Message message);
}
