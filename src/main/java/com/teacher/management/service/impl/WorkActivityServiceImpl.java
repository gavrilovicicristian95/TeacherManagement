package com.teacher.management.service.impl;

import com.teacher.management.models.WorkActivity;
import com.teacher.management.repository.WorkActivityRepository;
import com.teacher.management.service.WorkActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class WorkActivityServiceImpl implements WorkActivityService {
    private final WorkActivityRepository workActivityRepository;
    @Override
    public WorkActivity findByIdWorkActivity(int idWorkActivity) {
        return workActivityRepository.findByIdWorkActivity(idWorkActivity);
    }

    @Override
    public WorkActivity save(WorkActivity workActivity) {
        return workActivityRepository.save(workActivity);
    }

    @Override
    public List<WorkActivity> findAll() {
        return workActivityRepository.findAll();
    }



    @Override
    public List<WorkActivity> getWorkActivitiesByIdUser(Integer userId) {
        return workActivityRepository.getWorkActivitiesByIdUser(userId);
    }


}
