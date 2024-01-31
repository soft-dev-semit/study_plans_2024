package ntukhpi.semit.studyplans.service;

import ntukhpi.semit.studyplans.entity.fromasukhpi.Stepen;

import java.util.List;

public interface StepenService {

    Stepen createStepen(Stepen stepen);

    Stepen getStepenById(Long id);

    Stepen getStepenByName(String stName);

    List<Stepen> getAllStepen();

    Stepen updateStepen(Long id, Stepen updatedStepen);

    void deleteStepen(Long id);
}
