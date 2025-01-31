package duycoding.jdbc.jdbcExample.service;

import duycoding.jdbc.jdbcExample.model.Student;
import duycoding.jdbc.jdbcExample.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    @Autowired
    public StudentService(StudentRepo repo) {
        this.repo = repo;
    }

    public StudentRepo getRepo() {
        return repo;
    }

    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s) {
        repo.saved(s);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
