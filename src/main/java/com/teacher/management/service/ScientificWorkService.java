package com.teacher.management.service;

import com.teacher.management.models.ScientificWork;

import java.util.List;

public interface ScientificWorkService {

    public ScientificWork findScientificWorkByIdScientificWork(long scientificWork);
    public ScientificWork save(ScientificWork scientificWork);
    public List<ScientificWork> findAll();
    public List<ScientificWork> findScientificWorkByTipLucrare(String lucrare);
}
