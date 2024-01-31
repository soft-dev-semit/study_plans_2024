package ntukhpi.semit.studyplans.repository;

import ntukhpi.semit.studyplans.entity.fromasukhpi.Stepen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StepenRepository extends JpaRepository<Stepen, Long> {
    Stepen getStepenByStepenName(String stName);
}