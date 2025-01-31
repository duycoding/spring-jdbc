package duycoding.jdbc.jdbcExample.repo;

import duycoding.jdbc.jdbcExample.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    public void saved(Student s) {
        System.out.println("Added");
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
