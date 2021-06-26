package com.teacher.management.service.impl;

import com.teacher.management.models.ScientificWork;
import com.teacher.management.repository.ScientificWorkRepository;
import com.teacher.management.service.ScientificWorkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScientificWorkServiceImpl implements ScientificWorkService {

    private final ScientificWorkRepository scientificWorkRepository;

    @Override
    public ScientificWork findScientificWorkByIdScientificWork(long scientificWork) {
        return scientificWorkRepository.findScientificWorkByIdScientificWork(scientificWork);
    }

    @Override
    public ScientificWork save(ScientificWork scientificWork) {
        return scientificWorkRepository.save(scientificWork);
    }

    @Override
    public List<ScientificWork> findAll() {
        return scientificWorkRepository.findAll();
    }

    @Override
    public List<ScientificWork> findScientificWorkByTipLucrare(String lucrare) {
        return scientificWorkRepository.findScientificWorkByTipLucrare(lucrare);
    }

    @Override
    public List<ScientificWork> findScientificWorksByTipLucrareAndIdUser(String tipLucrare, Integer idUser) {
        return scientificWorkRepository.findScientificWorksByTipLucrareAndIdUser(tipLucrare,idUser);
    }
}
