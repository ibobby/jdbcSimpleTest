import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

/**
 * Created by b.istomin on 08.06.2015.
 */
public class SpringJdbc {

    public static void addStudent() {
        Student student = new Student();
        student.setName("Dao Spring JDBC Tempate");
        try (ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("spring/spring-app.xml")) {
            StudentDao studentDao = (StudentDao) appContext.getBean("studentDao");
            studentDao.saveStudent(student);
        }
    }

    public static List<Student> getStudents() {
        try (ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("spring/spring-app.xml")) {
            StudentDao studentDao = (StudentDao) appContext.getBean("studentDao");
            return studentDao.getAllStudents();
        }

    }
}
