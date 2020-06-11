import com.tim.dao.UserDaoImpl;
import com.tim.dao.UserDaoMysqlImpl;
import com.tim.service.UserService;
import com.tim.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        /*UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
        userService.getUser();*/

        //获取ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService userServiceImpl = (UserService) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
