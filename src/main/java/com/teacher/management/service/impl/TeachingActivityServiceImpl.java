package com.teacher.management.service.impl;

import com.teacher.management.models.TeachingActivity;
import com.teacher.management.repository.TeachingActivityRepository;
import com.teacher.management.repository.ThesisCoordinationRepository;
import com.teacher.management.service.TeachingActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeachingActivityServiceImpl implements TeachingActivityService {
    private final TeachingActivityRepository teachingActivityRepository;
    @Override
    public TeachingActivity findByIdActivity(long idTeachingActivity) {
        return teachingActivityRepository.findByIdActivity(idTeachingActivity);
    }

    @Override
    public TeachingActivity save(TeachingActivity teachingActivity) {
        return teachingActivityRepository.save(teachingActivity);
    }

    @Override
    public List<TeachingActivity> findAll() {
        return teachingActivityRepository.findAll();
    }

    @Override
    public List<TeachingActivity> getTeachingActivitiesByTipActivitate(String tipActivitate) {
        return teachingActivityRepository.getTeachingActivitiesByTipActivitate(tipActivitate);
    }

    @Override
    public List<TeachingActivity> getTeachingActivitiesByTipActivitateAndIdUser(String tipActivitate, Integer userId) {
        return teachingActivityRepository.getTeachingActivitiesByTipActivitateAndIdUser(tipActivitate,userId);
    }
}
