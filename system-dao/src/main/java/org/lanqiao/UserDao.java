package org.lanqiao;

import org.lanqiao.domain.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);
    public List<User> userList();
}
