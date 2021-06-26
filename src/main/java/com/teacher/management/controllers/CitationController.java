package com.teacher.management.controllers;

import com.teacher.management.models.Citation;
import com.teacher.management.service.CitationService;
import com.teacher.management.util.CitationScores;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/citations")
@RequiredArgsConstructor
public class CitationController {

    private final CitationService citationService;
    private final CitationScores citationScores;

    @PostMapping("/addCitation")
    public ResponseEntity<Citation> saveCitation(@RequestBody Citation citation){
        citation.setPunctaj(citationScores.getArticleScore(citation.getFactorImpact(),citation.getNrAutori(),citation.getTipCitatie()));
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
    @GetMapping("/getCitationsByUser/{tipCitatie}/{userId}")
    public List<Citation> getCitationsByTipCitatieAndUserId(@PathVariable String tipCitatie, @PathVariable Integer userId){
        return citationService.getCitationsByTipCitatieAndIdUser(tipCitatie, userId);
    }
}
