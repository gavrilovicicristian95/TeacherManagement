package com.teacher.management.controllers;

import com.teacher.management.models.ResponsabilityType;
import com.teacher.management.models.TeachingActivity;
import com.teacher.management.repository.ResponsabilityTypeRepository;
import com.teacher.management.service.ResponsabilityTypeService;
import com.teacher.management.service.TeachingActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/responsabilitiesTypes")
@RequiredArgsConstructor
public class ResponsabilityTypesController {
    private final ResponsabilityTypeService responsabilityTypeService;

    @PostMapping("/addResponsabilityType")
    public ResponseEntity<ResponsabilityType> saveResponsabilityType(@RequestBody ResponsabilityType responsabilityType) {
        responsabilityTypeService.save(responsabilityType);
        return new ResponseEntity<>(responsabilityType, HttpStatus.OK);

    }
    @GetMapping("/getAllResponsabilitesTypes")
    public List<ResponsabilityType> getAllResponsabilitiesTypes(){
        return responsabilityTypeService.findAll();
    }
}
