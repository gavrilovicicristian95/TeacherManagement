package com.teacher.management.service;

import com.teacher.management.models.MobilitiesProject;

import java.util.List;

public interface MobilitiesProjectsService {
    public MobilitiesProject save(MobilitiesProject mobilitiesProject);
    public List<MobilitiesProject> getMobilitiesProjectsByTipProiectAndIdUser(String tipProiect, Integer userId);
}
