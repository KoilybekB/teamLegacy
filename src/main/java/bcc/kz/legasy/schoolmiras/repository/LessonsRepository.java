package bcc.kz.legasy.schoolmiras.repository;

import bcc.kz.legasy.schoolmiras.model.Lessons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonsRepository extends JpaRepository<Lessons, Integer> {
}
