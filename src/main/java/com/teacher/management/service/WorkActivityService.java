package com.teacher.management.service;

import com.teacher.management.models.WorkActivity;

import java.util.List;

public interface WorkActivityService {
    public WorkActivity findByIdWorkActivity(int idWorkActivity);
    public WorkActivity save(WorkActivity workActivity);
    public List<WorkActivity> findAll();

    public List<WorkActivity> getWorkActivitiesByIdUser(Integer userId);

}
