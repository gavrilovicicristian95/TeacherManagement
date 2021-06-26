package com.teacher.management.controllers;

import com.teacher.management.models.Book;
import com.teacher.management.models.ConferenceParticipation;
import com.teacher.management.service.BookService;
import com.teacher.management.service.ConferenceParticipationService;
import com.teacher.management.util.ConferenceParticipationScores;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/conferences")
@RequiredArgsConstructor
public class ConferenceParticipationController {

    private final ConferenceParticipationService conferenceParticipationService;
    private final ConferenceParticipationScores conferenceParticipationScores;
    @PostMapping("/addConference")
    public ResponseEntity<ConferenceParticipation> saveConferenceParticipation(@RequestBody ConferenceParticipation conferenceParticipation){
        conferenceParticipation.setPunctaj(conferenceParticipationScores.getArticleScore(conferenceParticipation.getTipConferinta()));
        conferenceParticipationService.save(conferenceParticipation);

        return new ResponseEntity<>(conferenceParticipation, HttpStatus.OK);
    }

    @GetMapping("/getConference/{idConferenceParticipation}")
    public ConferenceParticipation findByIdConferenceParticipation(@PathVariable long idConferenceParticipation){
        return conferenceParticipationService.findByIdConferenceParticipation(idConferenceParticipation);
    }

    @GetMapping("/getAllConferenceParticipations")
    public List<ConferenceParticipation> getAllConferenceParticipations(){
        return conferenceParticipationService.findAll();
    }

    @GetMapping("/getConferenceParticipations/{tipConferinta}")
    public List<ConferenceParticipation> getConferencesByTipCarte(@PathVariable String tipConferinta){
        return conferenceParticipationService.findConferenceParticipationByTipConferinta(tipConferinta);
    }
    @GetMapping("/getConferenceParticipationsByUser/{tipConferinta}/{userId}")
    public List<ConferenceParticipation> getConferencesByTipCarteAndUserId(@PathVariable String tipConferinta,@PathVariable Integer userId){
        return conferenceParticipationService.findConferenceParticipationsByTipConferintaAndIdUser(tipConferinta, userId);
    }
}
