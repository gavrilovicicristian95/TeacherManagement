package com.teacher.management.repository;

import com.teacher.management.models.ScientificWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScientificWorkRepository extends JpaRepository<ScientificWork, Long> {

    public ScientificWork findScientificWorkByIdScientificWork(long scientificWork);
    public ScientificWork save(ScientificWork scientificWork);
    public List<ScientificWork> findAll();
    public List<ScientificWork> findScientificWorkByTipLucrare(String lucrare);
    public List<ScientificWork> findScientificWorksByTipLucrareAndIdUser(String tipLucrare, Integer idUser);
}
