package ntukhpi.semit.studyplans.repository;

import ntukhpi.semit.studyplans.entity.fromasukhpi.Dolghnost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DolghnostRepository extends JpaRepository<Dolghnost, Long> {

    Dolghnost getDolghnostByDolghnName(String posada);

    Dolghnost getDolghnostByCategoryEmployees(Integer id);

}