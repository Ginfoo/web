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
    //个人简单信息
    private long userId;
    private String userName;
    private String userPass;
    private int userSex;
    private String userIntro;
    private Blob userPic;
    private Date userBirthday;
    private double userAccount;
    //好友
    private Set<User> userFriends = new HashSet<User>();
    //书
    private Set<Book> userLoveBooks = new HashSet<Book>();
    private List<Book> userBuyBooks = new LinkedList<Book>();
    private Set<Book> userBorrowBooks = new HashSet<Book>();
    //消息
    private List<Message> userSendMessages = new LinkedList<Message>();
    private List<Message> userReceiveMessages = new LinkedList<Message>();
    //图片
    private Set<Image> userImages = new HashSet<Image>();

    public User() {
        super();
    }

    public User(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }

    public String getUserIntro() {
        return userIntro;
    }

    public void setUserIntro(String userIntro) {
        this.userIntro = userIntro;
    }

    public Blob getUserPic() {
        return userPic;
    }

    public void setUserPic(Blob userPic) {
        this.userPic = userPic;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public double getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(double userAccount) {
        this.userAccount = userAccount;
    }

    public Set<User> getUserFriends() {
        return userFriends;
    }

    public void setUserFriends(Set<User> userFriends) {
        this.userFriends = userFriends;
    }

    public Set<Book> getUserLoveBooks() {
        return userLoveBooks;
    }

    public void setUserLoveBooks(Set<Book> userLoveBooks) {
        this.userLoveBooks = userLoveBooks;
    }

    public List<Book> getUserBuyBooks() {
        return userBuyBooks;
    }

    public void setUserBuyBooks(List<Book> userBuyBooks) {
        this.userBuyBooks = userBuyBooks;
    }

    public Set<Book> getUserBorrowBooks() {
        return userBorrowBooks;
    }

    public void setUserBorrowBooks(Set<Book> userBorrowBooks) {
        this.userBorrowBooks = userBorrowBooks;
    }

    public List<Message> getUserSendMessages() {
        return userSendMessages;
    }

    public void setUserSendMessages(List<Message> userSendMessages) {
        this.userSendMessages = userSendMessages;
    }

    public List<Message> getUserReceiveMessages() {
        return userReceiveMessages;
    }

    public void setUserReceiveMessages(List<Message> userReceiveMessages) {
        this.userReceiveMessages = userReceiveMessages;
    }

    public Set<Image> getUserImages() {
        return userImages;
    }

    public void setUserImages(Set<Image> userImages) {
        this.userImages = userImages;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userIntro='" + userIntro + '\'' +
                ", userBirthday=" + userBirthday +
                '}';
    }
}
