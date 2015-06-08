import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by b.istomin on 08.06.2015.
 */
public class StudentJdbcDao implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveStudent(Student student) {
        jdbcTemplate.update("INSERT INTO student (NAME) VALUES (?) ", new Object[] {student.getName()});
    }
}
