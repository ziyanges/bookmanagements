package com.luoziyang.pojo;

import java.util.Date;

/**
 * @author luoziyang
 * @create 2022-12-28
 */
public class BorrowRecord {
    //借书账户
    String username;
    //借书ISBN码
    String ISBN;
    //借书开始时间
    Date settime;
    //借书结束时间
    Date deadtime;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Date getSettime() {
        return settime;
    }

    public void setSettime(Date settime) {
        this.settime = settime;
    }

    public Date getDeadtime() {
        return deadtime;
    }

    public void setDeadtime(Date deadtime) {
        this.deadtime = deadtime;
    }

    @Override
    public String toString() {
        return "BorrowRecord{" +
                "username='" + username + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", settime=" + settime +
                ", deadtime=" + deadtime +
                '}';
    }
}
