import java.util.List;

/**
 * Created by b.istomin on 08.06.2015.
 */
public interface StudentDao {

    public void saveStudent(Student student);

    public List<Student> getAllStudents();

}
