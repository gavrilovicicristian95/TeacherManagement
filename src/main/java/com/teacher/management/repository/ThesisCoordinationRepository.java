package com.teacher.management.repository;

import com.teacher.management.models.ThesisCoordination;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ThesisCoordinationRepository extends JpaRepository<ThesisCoordination,Long> {
    public ThesisCoordination findByIdThesisCoord(int idThesisCoord);
    public ThesisCoordination save(ThesisCoordination thesisCoordination);
    public List<ThesisCoordination> findAll();
    public List<ThesisCoordination> getThesisCoordonationByTipTeza(String tipTeza);
    public List<ThesisCoordination> getThesisCoordonationByTipTezaAndIdUser(String tipTeza, Integer  userId);
}
