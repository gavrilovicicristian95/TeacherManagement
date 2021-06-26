package com.teacher.management.service;

import com.teacher.management.models.InstitutionalActivity;

import java.util.List;

public interface InstitutionalActivityService {
    public InstitutionalActivity save(InstitutionalActivity institutionalActivity);
    public List<InstitutionalActivity> findInstitutionalActivitiesByTipActivitateInstitutionalaAndIdUser(String tipActivitate, Integer idUser);
}
