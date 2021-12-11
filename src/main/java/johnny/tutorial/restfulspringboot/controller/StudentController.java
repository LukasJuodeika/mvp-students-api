package johnny.tutorial.restfulspringboot.controller;

import java.util.*;

import javax.validation.Valid;

import johnny.tutorial.restfulspringboot.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import johnny.tutorial.restfulspringboot.repository.StudentRepository;

@RestController
@RequestMapping("/api/students")
public class StudentController extends BaseController{
    @Autowired
    StudentRepository studentRepository;

    // GET students/
    @GetMapping("")
    public Iterable<Student> findAll(){
        List<Student> students = new ArrayList<>();
        Iterator<Student> iterator = studentRepository.findAll().iterator();
        iterator.forEachRemaining(students::add);
        Collections.reverse(students);
        return students;
    }

    // GET /students/5
    @GetMapping("/{id}")
    public ResponseEntity<Student> findOne(@PathVariable(value = "id") long id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if(!studentOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        Student student = studentOptional.get();
        return ResponseEntity.ok().body(student);
    }

    // POST students/
    @PostMapping("")
    public ResponseEntity<Student> create(@Valid @RequestBody Student student){
        Student newStudent = studentRepository.save(student);
        return ResponseEntity.ok(newStudent);
    }

    // PUT /students/5
    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@PathVariable(value = "id") Long id,
                                          @Valid @RequestBody Student student) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if(!studentOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        Student oldStudent = studentOptional.get();
        oldStudent.setName(student.getName());
        oldStudent.setSurname(student.getSurname());

        Student updStudent = studentRepository.save(oldStudent);
        return ResponseEntity.ok(updStudent);
    }

    // DELETE /students/5
    @DeleteMapping("/{id}")
    public ResponseEntity<Student> delete(@PathVariable(value = "id") long id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if(studentOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        studentRepository.delete(studentOptional.get());
        return ResponseEntity.ok().build();
    }
}
