package com.luoziyang.Mapper;

import com.luoziyang.pojo.BorrowRecord;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.sql.Date;
import java.util.List;

/**
 * @author luoziyang
 * @create 2022-12-29
 */
public interface BorrowMapper {
    //查询某用户的借书记录
    List <BorrowRecord> selectallByusername(@Param("username") String username);
    //删除某用户的借书记录(还书)
    void deleterecord(@Param("username") String username,@Param("ISBN") String ISBN);
    //延期还书
    void updatetime(@Param("username") String username, @Param("ISBN") String ISBN, @Param("deadtime")Date deadtime);
    //借书、预定书
    void addrecord(@Param("username")String username,@Param("ISBN") String ISBN, @Param("settime")Date settime,@Param("deadtime")Date deadtime);
}
