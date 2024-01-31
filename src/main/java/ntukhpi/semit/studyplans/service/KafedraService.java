package ntukhpi.semit.studyplans.service;

import ntukhpi.semit.studyplans.entity.fromasukhpi.Kafedra;

import java.util.List;

public interface KafedraService {

    Kafedra createKafedra(Kafedra kafedra);

    Kafedra getKafedraById(Long id);

    List<Kafedra> getAllKafedra();

    Kafedra updateKafedra(Long id, Kafedra updatedKafedra);

    void deleteKafedra(Long id);

    Kafedra getKafedraByName(String kafName);

    //for filtering
    List<Kafedra> findKafedrasOfFakultet(String fakName);

    //For insert new cafedra
    Long findIDKafedraByKname(String kafName);

    String findAbrKafedraByKname(String kafName);

    Long findIDKafedraByKabr(String kafAbr);

    Long findIDKafedraByOid(String kafOid);

}
