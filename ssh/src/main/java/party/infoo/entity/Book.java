package party.infoo.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by infoo on 2017/2/20.
 */
public class Book {
    //书的简单信息
    private long bookId;
    private String bookName;
    private String bookAuthor;
    private Date bookPublishDate;
    private String bookIntro;
    private int bookCount;
    private float bookPrice;
    private BookType bookType;
    //书的其他信息
    private List<User> bookBuyUsers=new LinkedList<User>();
    private Set<User> bookBorrowUsers=new HashSet<User>();
    private Set<Image> bookImages=new HashSet<Image>();

    public Book() {
        super();
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Date getBookPublishDate() {
        return bookPublishDate;
    }

    public void setBookPublishDate(Date bookPublishDate) {
        this.bookPublishDate = bookPublishDate;
    }

    public String getBookIntro() {
        return bookIntro;
    }

    public void setBookIntro(String bookIntro) {
        this.bookIntro = bookIntro;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public List<User> getBookBuyUsers() {
        return bookBuyUsers;
    }

    public void setBookBuyUsers(List<User> bookBuyUsers) {
        this.bookBuyUsers = bookBuyUsers;
    }

    public Set<User> getBookBorrowUsers() {
        return bookBorrowUsers;
    }

    public void setBookBorrowUsers(Set<User> bookBorrowUsers) {
        this.bookBorrowUsers = bookBorrowUsers;
    }

    public Set<Image> getBookImages() {
        return bookImages;
    }

    public void setBookImages(Set<Image> bookImages) {
        this.bookImages = bookImages;
    }
}
