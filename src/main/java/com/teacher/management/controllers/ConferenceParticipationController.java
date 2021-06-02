package com.teacher.management.controllers;

import com.teacher.management.models.Book;
import com.teacher.management.models.ConferenceParticipation;
import com.teacher.management.service.BookService;
import com.teacher.management.service.ConferenceParticipationService;
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

    @PostMapping("/addConference")
    public ResponseEntity<ConferenceParticipation> saveConferenceParticipation(@RequestBody ConferenceParticipation conferenceParticipation){
        conferenceParticipationService.save(conferenceParticipation);

        return new ResponseEntity<>(conferenceParticipation, HttpStatus.OK);
    }

    @GetMapping("/getConference/{idConference}")
    public ConferenceParticipation findByIdConferenceParticipation(@PathVariable long idConferenceParticipation){
        return conferenceParticipationService.findByIdConferenceParticipation(idConferenceParticipation);
    }

    @GetMapping("/getAllConferenceParticipations")
    public List<ConferenceParticipation> getAllConferenceParticipations(){
        return conferenceParticipationService.findAll();
    }

    @GetMapping("/getConferenceParticipations/{tipConference}")
    public List<ConferenceParticipation> getConferencesByTipCarte(@PathVariable String tipConferinta){
        return conferenceParticipationService.findConferenceParticipationByTipConferinta(tipConferinta);
    }
}
