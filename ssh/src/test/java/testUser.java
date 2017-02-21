import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import party.infoo.entity.User;
import party.infoo.service.UserService;

/**
 * Created by infoo on 2017/2/21.
 */
public class testUser {
    private ApplicationContext applicationContext;

    @Before
    public void getApplicationContext() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testLogin() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        User user = new User("infoo", "123456");
        user = userService.loginUser(user);
        System.out.println("===============");
        System.out.println(user.getUserId());
    }

    @Test
    public void testSave() {
        UserService userService = (UserService) applicationContext.getBean("userService");
        User user = new User();
        user.setUserName("infoo3");
        user.setUserPass("123456");
        user.setUserAccount(0);
        user = userService.registerUser(user);
        if (user != null) {
            System.out.println("注册成功，id: " + user.getUserId());
        } else {
            System.out.println("用户名已被占用");
        }
    }

    @Test
    public void testAddFriend() {
        UserService userService = (UserService) applicationContext.getBean("userService");

        User friend = userService.getUser(User.class, 3);
        userService.getUser(User.class, 1).getUserFriends().add(friend);
        User user=userService.getUser(User.class, 1);
        userService.updateUser(user,user);
    }
}
