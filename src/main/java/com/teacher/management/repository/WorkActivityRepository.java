package com.teacher.management.repository;

import com.teacher.management.models.WorkActivity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.net.Inet4Address;
import java.util.List;

public interface WorkActivityRepository extends JpaRepository<WorkActivity,Long> {
    public WorkActivity findByIdWorkActivity(long idWorkActivity);
    public WorkActivity save(WorkActivity workActivity);
    public List<WorkActivity> findAll();

    public List<WorkActivity> getWorkActivitiesByIdUser(Integer userId);

}
