package johnny.tutorial.restfulspringboot.repository;

import org.springframework.data.repository.CrudRepository;

import johnny.tutorial.restfulspringboot.domain.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
