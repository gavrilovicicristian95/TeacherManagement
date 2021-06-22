package com.teacher.management.service.impl;

import com.teacher.management.models.ThesisCoordination;
import com.teacher.management.repository.ThesisCoordinationRepository;
import com.teacher.management.service.ThesisCoordinationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ThesisCoordinationServiceImpl implements ThesisCoordinationService {
    private final ThesisCoordinationRepository thesisCoordinationRepository;
    @Override
    public ThesisCoordination findByIdThesisCoord(long idThesisCoord) {
        return thesisCoordinationRepository.findByIdThesisCoord(idThesisCoord);
    }

    @Override
    public ThesisCoordination save(ThesisCoordination thesisCoordination) {
        return thesisCoordinationRepository.save(thesisCoordination);
    }

    @Override
    public List<ThesisCoordination> findAll() {
        return thesisCoordinationRepository.findAll();
    }

    @Override
    public List<ThesisCoordination> getThesisCoordonationByTipTeza(String tipTeza) {
        return thesisCoordinationRepository.getThesisCoordonationByTipTeza(tipTeza);
    }

    @Override
    public List<ThesisCoordination> getThesisCoordonationByTipTezaAndIdUser(String tipTeza, Integer userId) {
        return thesisCoordinationRepository.getThesisCoordonationByTipTezaAndIdUser(tipTeza,userId);
    }
}
