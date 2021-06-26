package com.teacher.management.controllers;

import com.teacher.management.models.Responsabilities;
import com.teacher.management.service.ResponsabilitiesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/responsabilities")
@RequiredArgsConstructor
public class ResponsabilitiesController {
    private final ResponsabilitiesService responsabilitiesService;
    @PostMapping("/addResponsability")
    public ResponseEntity<Responsabilities> saveResponsability(@RequestBody Responsabilities responsabilities){
        responsabilitiesService.save(responsabilities);
        return new ResponseEntity<>(responsabilities, HttpStatus.OK);
    }
    @GetMapping("/getResponsabilitiesByUser/{responsabilityType}/{userId}")
    public List<Responsabilities> getResponsabilitiesByResponsabilityTypeAndIdUser(@PathVariable String responsabilityType, @PathVariable Integer userId){
        return responsabilitiesService.getResponsabilitiesByResponsabilityTypeAndIdUser(responsabilityType, userId);
    }
}
