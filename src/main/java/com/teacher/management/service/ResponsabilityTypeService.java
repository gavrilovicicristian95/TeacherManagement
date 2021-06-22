package com.teacher.management.service;

import com.teacher.management.models.ResponsabilityType;

import java.util.List;

public interface ResponsabilityTypeService {
    public ResponsabilityType save(ResponsabilityType responsabilityType);
    public List<ResponsabilityType> findAll();
}
