package com.luoziyang.Mapper;

import com.luoziyang.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author luoziyang
 * @create 2022-12-28
 */
public interface UserMapper {
    //用户正常登陆检验
    User selectbylogin(@Param("username")String username, @Param("password")String password);
    //系统管理员操作：增加读者
    void addpeople(@Param("username")String username, @Param("password")String password,@Param("type")String type);
    //系统管理员操作：删除账号
    void deletepeople(@Param("username") String username);
    //修改密码
    void updatepassword(@Param("username") String username,@Param("password") String password);
    //查找相关人员
    List<User> selectpeople(@Param("type")String type);
}
