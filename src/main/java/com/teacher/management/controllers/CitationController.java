package com.teacher.management.controllers;

import com.teacher.management.models.Citation;
import com.teacher.management.service.CitationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/citations")
@RequiredArgsConstructor
public class CitationController {

    private final CitationService citationService;

    @PostMapping("/addCitation")
    public ResponseEntity<Citation> saveCitation(@RequestBody Citation citation){
        citationService.save(citation);

        return new ResponseEntity<>(citation, HttpStatus.OK);
    }

    @GetMapping("/getCitation/{idCitation}")
    public Citation findByIdCitation(@PathVariable long idCitation){
        return citationService.findByIdCitation(idCitation);
    }

    @GetMapping("getAllCitations")
    public List<Citation> getAllCitations(){
        return citationService.findAll();
    }

    @GetMapping("/getCitations/{tipCitatie}")
    public List<Citation> getCitationsByTipCitatie(@PathVariable String tipCitatie){
        return citationService.getCitationByTipCitatie(tipCitatie);
    }
}
