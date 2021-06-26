package com.teacher.management.controllers;

import com.teacher.management.models.MobilitiesProject;
import com.teacher.management.models.ScientificWork;
import com.teacher.management.service.MobilitiesProjectsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/mobilitiesProjects")
@RequiredArgsConstructor
public class MobilitiesProjectsController {
    private final MobilitiesProjectsService mobilitiesProjectsService;
    @PostMapping("/addMobilityProject")
    public ResponseEntity<MobilitiesProject> saveMobilityProject(@RequestBody MobilitiesProject mobilitiesProject){
        mobilitiesProjectsService.save(mobilitiesProject);
        return new ResponseEntity<>(mobilitiesProject, HttpStatus.OK);
    }
    @GetMapping("/getMobilityProjectsByUser/{tipProiect}/{userId}")
    public List<MobilitiesProject> getMobilitiesProjectsByTipProiectAndIdUser(@PathVariable String tipProiect, @PathVariable Integer userId){
        return mobilitiesProjectsService.getMobilitiesProjectsByTipProiectAndIdUser(tipProiect,userId);
    }
}
