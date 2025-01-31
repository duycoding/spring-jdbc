package duycoding.jdbc.jdbcExample;

import duycoding.jdbc.jdbcExample.model.Student;
import duycoding.jdbc.jdbcExample.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class JdbcExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JdbcExampleApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(1);
		s.setMarks(10);
		s.setName("ABC");

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
