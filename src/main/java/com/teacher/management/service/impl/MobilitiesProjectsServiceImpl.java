package com.teacher.management.service.impl;

import com.teacher.management.models.MobilitiesProject;
import com.teacher.management.repository.MobilitiesProjectsRepository;
import com.teacher.management.service.MobilitiesProjectsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MobilitiesProjectsServiceImpl implements MobilitiesProjectsService {
    private final MobilitiesProjectsRepository mobilitiesProjectsRepository;

    @Override
    public MobilitiesProject save(MobilitiesProject mobilitiesProject) {
        return mobilitiesProjectsRepository.save(mobilitiesProject);
    }

    @Override
    public List<MobilitiesProject> getMobilitiesProjectsByTipProiectAndIdUser(String tipProiect, Integer userId) {
        return mobilitiesProjectsRepository.getMobilitiesProjectsByTipProiectAndIdUser(tipProiect, userId);
    }
}
