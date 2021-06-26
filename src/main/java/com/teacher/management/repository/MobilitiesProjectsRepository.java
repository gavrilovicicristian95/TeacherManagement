package com.teacher.management.repository;

import com.teacher.management.models.MobilitiesProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MobilitiesProjectsRepository extends JpaRepository<MobilitiesProject,Long> {
    public MobilitiesProject save(MobilitiesProject mobilitiesProject);
    public List<MobilitiesProject> getMobilitiesProjectsByTipProiectAndIdUser(String tipProiect, Integer userId);
}
