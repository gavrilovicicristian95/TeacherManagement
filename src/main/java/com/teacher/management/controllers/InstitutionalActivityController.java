package com.teacher.management.controllers;

import com.teacher.management.models.InstitutionalActivity;
import com.teacher.management.models.ScientificWork;
import com.teacher.management.service.InstitutionalActivityService;
import com.teacher.management.util.InstitutionalActivitiesScores;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/institutionalActivities")
@RequiredArgsConstructor
public class InstitutionalActivityController {
    private final InstitutionalActivityService institutionalActivityService;
    private final InstitutionalActivitiesScores institutionalActivitiesScores;
    @PostMapping("/addInstitutionalActivity")
    public ResponseEntity<InstitutionalActivity> saveScientificWork(@RequestBody InstitutionalActivity institutionalActivity){
        institutionalActivity.setPunctaj(institutionalActivitiesScores.getArticleScore(institutionalActivity.getTipActivitateInstitutionala()));
        institutionalActivityService.save(institutionalActivity);
        return new ResponseEntity<>(institutionalActivity, HttpStatus.OK);
    }
    @GetMapping("/addInstitutionalActivity/{tipLActivitate}/{userId}")
    public List<InstitutionalActivity> getInstitutionalActivitiesByTipActivitateInstitutionalaAndIdUser(@PathVariable String tipLActivitate, @PathVariable Integer userId){
        return institutionalActivityService.findInstitutionalActivitiesByTipActivitateInstitutionalaAndIdUser(tipLActivitate, userId);
    }
}
