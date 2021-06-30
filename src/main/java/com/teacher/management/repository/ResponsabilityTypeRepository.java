package com.teacher.management.repository;

import com.teacher.management.models.ResponsabilityType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResponsabilityTypeRepository extends JpaRepository<ResponsabilityType,Long> {
    public ResponsabilityType save(ResponsabilityType responsabilityType);
    public List<ResponsabilityType> findAll();
    public List<ResponsabilityType> getResponsabilityTypesByTipResponsabilitate(String tipResponsabilitate);
    public ResponsabilityType getResponsabilityTypeByResponsabilityType(String responsabilityType);
}
