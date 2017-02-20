package party.infoo.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by infoo on 2017/2/21.
 */
public class BookType {
    private int bookTypeId;
    private String bookTypeName;
    private String bookTypeIntro;
    private Set<Book> bookTypeOwnBooks = new HashSet<Book>();

    public BookType() {
        super();
    }

    public int getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(int bookTypeId) {
        this.bookTypeId = bookTypeId;
    }

    public String getBookTypeName() {
        return bookTypeName;
    }

    public void setBookTypeName(String bookTypeName) {
        this.bookTypeName = bookTypeName;
    }

    public String getBookTypeIntro() {
        return bookTypeIntro;
    }

    public void setBookTypeIntro(String bookTypeIntro) {
        this.bookTypeIntro = bookTypeIntro;
    }

    public Set<Book> getBookTypeOwnBooks() {
        return bookTypeOwnBooks;
    }

    public void setBookTypeOwnBooks(Set<Book> bookTypeOwnBooks) {
        this.bookTypeOwnBooks = bookTypeOwnBooks;
    }
}
