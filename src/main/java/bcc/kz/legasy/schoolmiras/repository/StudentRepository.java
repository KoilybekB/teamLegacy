package bcc.kz.legasy.schoolmiras.repository;

import bcc.kz.legasy.schoolmiras.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
