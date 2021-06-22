package com.teacher.management.service.impl;

import com.teacher.management.models.ResponsabilityType;
import com.teacher.management.repository.ResponsabilityTypeRepository;
import com.teacher.management.service.ResponsabilityTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResponsabilityTypeServiceImpl implements ResponsabilityTypeService {
    private final ResponsabilityTypeRepository responsabilityTypeRepository;
    @Override
    public ResponsabilityType save(ResponsabilityType responsabilityType) {
        return responsabilityTypeRepository.save(responsabilityType);
    }

    @Override
    public List<ResponsabilityType> findAll() {
        return responsabilityTypeRepository.findAll();
    }
}
