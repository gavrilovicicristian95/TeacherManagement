package com.teacher.management.controllers;

import com.teacher.management.models.TeachingActivity;
import com.teacher.management.models.TeachingActivity;
import com.teacher.management.service.TeachingActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/teachingActivities")
@RequiredArgsConstructor
public class TeachingActivitiesController {
    private final TeachingActivityService teachingActivityService;
    @PostMapping("/addTeachingActivity")
    public ResponseEntity<TeachingActivity> saveTeachingActivity(@RequestBody TeachingActivity teachingActivity){
        
        teachingActivityService.save(teachingActivity);
        return new ResponseEntity<>(teachingActivity, HttpStatus.OK);
    }
    @GetMapping("/getTeachingActivity/{idTeachingActivity}")
    public TeachingActivity findByIdTeachingActivity(@PathVariable int idTeachingActivity){
        return teachingActivityService.findByIdActivity(idTeachingActivity);
    }

    @GetMapping("/getAllTeachingActivities")
    public List<TeachingActivity> getAllTeachingActivities(){
        return teachingActivityService.findAll();
    }

    @GetMapping("/getTeachingActivities/{tipTeachingActivity}")
    public List<TeachingActivity> getTeachingActivitiesByTipTeachingActivity(@PathVariable String tipTeachingActivity){
        return teachingActivityService.getTeachingActivitiesByTipActivitate(tipTeachingActivity);
    }
    @GetMapping("/getTeachingActivitiesByUser/{tipTeachingActivity}/{userId}")
    public List<TeachingActivity> getTeachingActivitiesByTipTeachingActivityAndUserId(@PathVariable String tipTeachingActivity,@PathVariable Integer userId){
        return teachingActivityService.getTeachingActivitiesByTipActivitateAndIdUser(tipTeachingActivity,userId);
    }
}
