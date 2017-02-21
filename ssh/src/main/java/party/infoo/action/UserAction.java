package party.infoo.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.stereotype.Controller;
import party.infoo.entity.User;
import party.infoo.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserAction extends ActionSupport implements ServletRequestAware {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private HttpServletRequest request;

    @Resource
    private UserService userService;

    private User user;
    private String error;


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    public String getError() {
        return error;
    }


    public void setError(String error) {
        this.error = error;
    }


    public String login() throws Exception {
        HttpSession session = request.getSession();
        User currentUser = userService.loginUser(user);
        if (currentUser != null) {
            session.setAttribute("currentUser", currentUser);
            return SUCCESS;
        } else {
            error = "用后名或者密码错误！";
            return ERROR;
        }
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        // TODO Auto-generated method stub
        this.request = request;
    }

}
