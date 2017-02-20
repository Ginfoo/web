package party.infoo.service;

import party.infoo.entity.User;

/**
 * Created by infoo on 2017/2/21.
 */

public interface UserService {
    public User loginUser(User user);
    public void addFriend(User user,User friend);
}
