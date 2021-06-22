package com.teacher.management.service;

import com.teacher.management.models.ThesisCoordination;

import java.util.List;

public interface ThesisCoordinationService {
    public ThesisCoordination findByIdThesisCoord(long idThesisCoord);
    public ThesisCoordination save(ThesisCoordination thesisCoordination);
    public List<ThesisCoordination> findAll();
    public List<ThesisCoordination> getThesisCoordonationByTipTeza(String tipTeza);
    public List<ThesisCoordination> getThesisCoordonationByTipTezaAndIdUser(String tipTeza, Integer  userId);
}
