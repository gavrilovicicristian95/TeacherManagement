package com.teacher.management.service.impl;

import com.teacher.management.models.Responsabilities;
import com.teacher.management.repository.ResponsabilitiesRepository;
import com.teacher.management.service.ResponsabilitiesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResponsabilitiesServiceImpl implements ResponsabilitiesService {
    private final ResponsabilitiesRepository responsabilitiesRepository;

    @Override
    public Responsabilities save(Responsabilities responsabilities) {
        return responsabilitiesRepository.save(responsabilities);
    }

    @Override
    public List<Responsabilities> getResponsabilitiesByTipResponsabilitateAndIdUser(String tipResponsabilitate, Integer idUser) {
        return responsabilitiesRepository.getResponsabilitiesByTipResponsabilitateAndIdUser(tipResponsabilitate, idUser);
    }

}
