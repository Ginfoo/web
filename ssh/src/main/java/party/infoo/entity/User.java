package party.infoo.entity;

import java.sql.Blob;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by infoo on 2017/2/20.
 */
public class User {
    private long userId;
    private String userName;
    private String userPass;
    private int userSex;
    private String userIntro;
    private Blob userPic;
    private Date userBirthday;

    private Set<User> usrFriends = new HashSet<User>();

    private Set<Book> userLoveBooks = new HashSet<Book>();
    private List<Book> userBuyBooks = new LinkedList<Book>();
    private List<Book> userBorrowBooks = new LinkedList<Book>();

    private List<Message> userSendMessages = new LinkedList<Message>();
    private List<Message> userReceiveMessages = new LinkedList<Message>();

    private Set<Image> userImages = new HashSet<Image>();


}
