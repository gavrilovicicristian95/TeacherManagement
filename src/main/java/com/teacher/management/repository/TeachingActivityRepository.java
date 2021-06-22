package com.teacher.management.repository;

import com.teacher.management.models.TeachingActivity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeachingActivityRepository extends JpaRepository<TeachingActivity,Long> {
    public TeachingActivity findByIdActivity(long idTeachingActivity);
    public TeachingActivity save(TeachingActivity teachingActivity);
    public List<TeachingActivity> findAll();
    public List<TeachingActivity> getTeachingActivitiesByTipActivitate(String tipActivitate);
    public List<TeachingActivity> getTeachingActivitiesByTipActivitateAndIdUser(String tipActivitate, Integer userId);
}
