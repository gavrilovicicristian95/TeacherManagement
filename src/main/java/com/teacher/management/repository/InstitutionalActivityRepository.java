package com.teacher.management.repository;

import com.teacher.management.models.InstitutionalActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstitutionalActivityRepository extends JpaRepository<InstitutionalActivity,Long> {
    public InstitutionalActivity save(InstitutionalActivity institutionalActivity);
    public List<InstitutionalActivity> findInstitutionalActivitiesByTipActivitateInstitutionalaAndIdUser(String tipActivitate, Integer idUser);

}
