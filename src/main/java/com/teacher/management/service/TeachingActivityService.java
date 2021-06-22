package com.teacher.management.service;

import com.teacher.management.models.TeachingActivity;

import java.util.List;

public interface TeachingActivityService {
    public TeachingActivity findByIdActivity(int idTeachingActivity);
    public TeachingActivity save(TeachingActivity teachingActivity);
    public List<TeachingActivity> findAll();
    public List<TeachingActivity> getTeachingActivitiesByTipActivitate(String tipActivitate);
    public List<TeachingActivity> getTeachingActivitiesByTipActivitateAndIdUser(String tipActivitate, Integer userId);
}
