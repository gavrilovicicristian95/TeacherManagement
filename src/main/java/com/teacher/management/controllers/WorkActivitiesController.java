package com.teacher.management.controllers;

import com.teacher.management.models.WorkActivity;
import com.teacher.management.service.WorkActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/workActivities")
@RequiredArgsConstructor
public class WorkActivitiesController {
    private final WorkActivityService workActivityService;
    @PostMapping("/addWorkActivity")
    public ResponseEntity<WorkActivity> saveWorkActivity(@RequestBody WorkActivity workActivity){

        workActivityService.save(workActivity);
        return new ResponseEntity<>(workActivity, HttpStatus.OK);
    }
    @GetMapping("/getWorkActivity/{idWorkActivity}")
    public WorkActivity findByIdWorkActivity(@PathVariable int idWorkActivity){
        return workActivityService.findByIdWorkActivity(idWorkActivity);
    }

    @GetMapping("/getAllWorkActivities")
    public List<WorkActivity> getAllWorkActivities(){
        return workActivityService.findAll();
    }


    @GetMapping("/getWorkActivitiesByUserId/{userId}")
    public List<WorkActivity> getWorkActivitiesByTipWorkActivityAndUserId(@PathVariable Integer userId){
        return workActivityService.getWorkActivitiesByIdUser(userId);
    }
}
