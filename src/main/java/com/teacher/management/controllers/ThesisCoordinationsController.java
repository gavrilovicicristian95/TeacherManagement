package com.teacher.management.controllers;

import com.teacher.management.models.ThesisCoordination;
import com.teacher.management.service.ThesisCoordinationService;
import com.teacher.management.util.ThesisCoordinationScores;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/thesisCoordinations")
@RequiredArgsConstructor
public class ThesisCoordinationsController {
    private final ThesisCoordinationService thesisCoordinationService;
    private final ThesisCoordinationScores thesisCoordinationScores;
    @PostMapping("/addThesisCoordination")
    public ResponseEntity<ThesisCoordination> saveThesisCoordination(@RequestBody ThesisCoordination thesisCoordination){
        thesisCoordination.setPunctaj(thesisCoordinationScores.getArticleScore(thesisCoordination.getTipTeza()));
        thesisCoordinationService.save(thesisCoordination);
        return new ResponseEntity<>(thesisCoordination, HttpStatus.OK);
    }
    @GetMapping("/getThesisCoordination/{idThesisCoordination}")
    public ThesisCoordination findByIdThesisCoordination(@PathVariable long idThesisCoordination){
        return thesisCoordinationService.findByIdThesisCoord(idThesisCoordination);
    }

    @GetMapping("/getAllThesisCoordinations")
    public List<ThesisCoordination> getAllThesisCoordinations(){
        return thesisCoordinationService.findAll();
    }

    @GetMapping("/getThesisCoordinations/{tipThesisCoordination}")
    public List<ThesisCoordination> getThesisCoordinationsByTipThesisCoordination(@PathVariable String tipThesisCoordination){
        return thesisCoordinationService.getThesisCoordonationByTipTeza(tipThesisCoordination);
    }
    @GetMapping("/getThesisCoordinationsByUser/{tipThesisCoordination}/{userId}")
    public List<ThesisCoordination> getThesisCoordinationsByTipThesisCoordinationAndUserId(@PathVariable String tipThesisCoordination,@PathVariable Integer userId){
        return thesisCoordinationService.getThesisCoordonationByTipTezaAndIdUser(tipThesisCoordination,userId);
    }
}
