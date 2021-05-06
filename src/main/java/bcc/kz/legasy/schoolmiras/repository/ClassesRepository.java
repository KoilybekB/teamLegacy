package bcc.kz.legasy.schoolmiras.repository;

import bcc.kz.legasy.schoolmiras.model.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRepository extends JpaRepository<Classes, Integer> {
}
