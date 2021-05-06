package bcc.kz.legasy.schoolmiras.repository;

import bcc.kz.legasy.schoolmiras.model.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectsRepository extends JpaRepository<Subjects, Integer> {
}
