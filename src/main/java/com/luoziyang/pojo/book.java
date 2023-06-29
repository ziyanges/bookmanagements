package com.luoziyang.pojo;

/**
 * @author luoziyang
 * @create 2022-12-28
 */
public class book {
    String ISBN;
    String author;
    String bookname;
    //库存
    int reserve;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getReserve() {
        return reserve;
    }

    public void setReserve(int reserve) {
        this.reserve = reserve;
    }

    @Override
    public String toString() {
        return "book{" +
                "ISBN='" + ISBN + '\'' +
                ", author='" + author + '\'' +
                ", bookname='" + bookname + '\'' +
                ", reserve=" + reserve +
                '}';
    }
}
