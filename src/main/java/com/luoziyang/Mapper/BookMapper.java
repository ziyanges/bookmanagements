package com.luoziyang.Mapper;

import com.luoziyang.pojo.book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author luoziyang
 * @create 2022-12-28
 */
public interface BookMapper {
    //图书管理员或借阅者对书籍(根据书名)进行查询
    List<book> selectbybookname(@Param("bookname") String bookname);
    //图书管理员或借阅者对书籍(根据ISBN)进行查询
    book selectbyISBN(@Param("ISBN") String ISBN);
    //图书管理员进行图书添加
    void addbook(@Param("ISBN")String ISBN, @Param("author")String author,@Param("bookname")String bookname,@Param("reserve")int reserve);
    //图书管理员对图书进行删除
    void deletebook(@Param("ISBN")String ISBN);
    //对图书库存进行修改(根据ISBN)
    void updateReserve(@Param("reserve") int reserve,@Param("ISBN")String ISBN);
}
