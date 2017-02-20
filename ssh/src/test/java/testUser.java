import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import party.infoo.entity.User;
import party.infoo.service.UserService;

/**
 * Created by infoo on 2017/2/21.
 */
public class testUser {
    @Test
    public void testLogin() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        User user = new User("infoo", "123456");
        user = userService.loginUser(user);
        System.out.println("===============");
        System.out.println(user.getUserId());

    }
}
