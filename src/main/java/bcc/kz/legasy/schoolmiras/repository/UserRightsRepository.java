package bcc.kz.legasy.schoolmiras.repository;

import bcc.kz.legasy.schoolmiras.model.UserRights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRightsRepository extends JpaRepository<UserRights,Integer> {
}
