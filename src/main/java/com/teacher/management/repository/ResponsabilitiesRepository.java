package com.teacher.management.repository;

import com.teacher.management.models.Responsabilities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResponsabilitiesRepository extends JpaRepository<Responsabilities,Long> {
    public Responsabilities save(Responsabilities responsabilities);
    public List<Responsabilities> getResponsabilitiesByTipResponsabilitateAndIdUser(String tipResponsabilitate, Integer idUser);
}
