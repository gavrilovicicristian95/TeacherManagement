package com.teacher.management.service.impl;

import com.teacher.management.models.InstitutionalActivity;
import com.teacher.management.repository.InstitutionalActivityRepository;
import com.teacher.management.service.InstitutionalActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstitutionalActivityServiceImpl implements InstitutionalActivityService {
    private final InstitutionalActivityRepository institutionalActivityRepository;

    @Override
    public InstitutionalActivity save(InstitutionalActivity institutionalActivity) {
        return institutionalActivityRepository.save(institutionalActivity);
    }

    @Override
    public List<InstitutionalActivity> findInstitutionalActivitiesByTipActivitateInstitutionalaAndIdUser(String tipActivitate, Integer idUser) {
        return institutionalActivityRepository.findInstitutionalActivitiesByTipActivitateInstitutionalaAndIdUser(tipActivitate, idUser);
    }
}
