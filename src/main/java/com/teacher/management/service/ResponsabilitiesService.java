package com.teacher.management.service;

import com.teacher.management.models.Responsabilities;

import java.util.List;

public interface ResponsabilitiesService {
    public Responsabilities save(Responsabilities responsabilities);
    public List<Responsabilities> getResponsabilitiesByTipResponsabilitateAndIdUser(String tipResponsabilitate, Integer idUser);
}
