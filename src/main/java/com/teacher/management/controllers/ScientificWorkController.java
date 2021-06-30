package com.teacher.management.controllers;

import com.teacher.management.models.ScientificWork;
import com.teacher.management.models.TeachingActivity;
import com.teacher.management.service.ScientificWorkService;
import com.teacher.management.util.ScientificWorkScores;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/scientificWorks")
@RequiredArgsConstructor
public class ScientificWorkController {
    private final ScientificWorkService scientificWorkService;
    private final ScientificWorkScores scientificWorkScores;
    @PostMapping("/addScientificWork")
    public ResponseEntity<ScientificWork> saveScientificWork(@RequestBody ScientificWork scientificWork){
        scientificWork.setPunctaj(scientificWorkScores.getArticleScore(scientificWork.getTipLucrare(),scientificWork.getFactorImpact(),scientificWork.getNrAutori()));
        scientificWorkService.save(scientificWork);
        return new ResponseEntity<>(scientificWork, HttpStatus.OK);
    }
    @GetMapping("/getScientificWorksByUser/{tipLucrare}/{userId}")
    public List<ScientificWork> getScientificWorksByTipLucrareAndIdUserd(@PathVariable String tipLucrare, @PathVariable Integer userId){
        return scientificWorkService.findScientificWorksByTipLucrareAndIdUser(tipLucrare,userId);
    }
}
