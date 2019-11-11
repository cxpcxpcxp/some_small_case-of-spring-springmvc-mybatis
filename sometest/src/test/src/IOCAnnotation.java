import com.sometest.config.MyApplcationContext;
import com.sometest.pojo.Role;
import com.sometest.service.IRoleService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class IOCAnnotation {
    @Test
    public void findAll(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyApplcationContext.class);
        IRoleService roleService = context.getBean("roleService", IRoleService.class);
        List<Role> all = roleService.findAll();
        for (Role role : all) {
            System.out.println(role);
        }
    }
}
