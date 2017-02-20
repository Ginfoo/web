package party.infoo.service.impl;

import org.springframework.stereotype.Service;
import party.infoo.dao.BaseDao;
import party.infoo.entity.User;
import party.infoo.service.UserService;

import javax.annotation.Resource;

/**
 * Created by infoo on 2017/2/21.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private BaseDao<User> baseDao;

    @Override
    public User loginUser(User user) {
        String hql = "from User u where u.userName=? and u.userPass=?";
        return (User) baseDao.login(hql, user.getUserName(), user.getUserPass());
    }

    @Override
    public void addFriend(User user, User friend) {

    }
}
