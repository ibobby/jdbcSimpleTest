import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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

    public List<Student> getAllStudents() {
        return jdbcTemplate.query
                ("Select Name as Name from Student",
                        new ParameterizedRowMapper<Student>() {
                            @Override
                            public Student mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                                Student student = new Student();
                                student.setName(resultSet.getString("Name"));
                                return student;
                            }
                        });
    }
}
