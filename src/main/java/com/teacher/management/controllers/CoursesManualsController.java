package com.teacher.management.controllers;

import com.teacher.management.models.CoursesManuals;
import com.teacher.management.service.CoursesManualsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/coursesManuals")
@RequiredArgsConstructor
public class CoursesManualsController {
    private final CoursesManualsService coursesManualsService;
    @PostMapping("/addCoursesManuals")
    public ResponseEntity<CoursesManuals> saveCoursesManuals(@RequestBody CoursesManuals coursesManuals){

        coursesManualsService.save(coursesManuals);
        return new ResponseEntity<>(coursesManuals, HttpStatus.OK);
    }
    @GetMapping("/getCoursesManuals/{idCoursesManuals}")
    public CoursesManuals findByIdCoursesManuals(@PathVariable long idCoursesManuals){
        return coursesManualsService.findByIdCourseManual(idCoursesManuals);
    }

    @GetMapping("/getAllCoursesManuals")
    public List<CoursesManuals> getAllCoursesManualss(){
        return coursesManualsService.findAll();
    }

    @GetMapping("/getAllCoursesManuals/{tipCoursesManuals}")
    public List<CoursesManuals> getCoursesManualssByTipCoursesManuals(@PathVariable String tipCoursesManuals){
        return coursesManualsService.getCoursesManualsByTipCursManual(tipCoursesManuals);
    }
    @GetMapping("/getAllCoursesManualsByUser/{tipCoursesManuals}/{userId}")
    public List<CoursesManuals> getCoursesManualssByTipCoursesManualsAndUserId(@PathVariable String tipCoursesManuals,@PathVariable Integer userId){
        return coursesManualsService.getCoursesManualsByTipCursManualAndIdUser(tipCoursesManuals,userId);
    }
}
