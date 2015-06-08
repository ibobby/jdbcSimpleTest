import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Created by b.istomin on 08.06.2015.
 */
public class SpringMain {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("DaoTest");
        try (ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("spring/spring-app.xml")) {
            StudentDao studentDao = (StudentDao) appContext.getBean("studentDao");
            studentDao.saveStudent(student);
        }

    }

}
