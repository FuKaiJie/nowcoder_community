package com.nowcoder.community.util;

import com.nowcoder.community.entity.User;
import com.nowcoder.community.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author FKJ
 * @create 2023-02-26 16:02
 *  持有用户信息，用于替代Session对象
 */

@Component
public class HostHolder {

    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUsers(User user) {
        users.set(user);
    }

    public User getuser() {
        return users.get();
    }

    public void clear() {
        users.remove();
    }
}
