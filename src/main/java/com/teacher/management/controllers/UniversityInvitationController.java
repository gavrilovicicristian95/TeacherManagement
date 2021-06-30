package com.teacher.management.controllers;

import com.teacher.management.models.UniversityInvitation;
import com.teacher.management.service.UniversityInvitationService;
import com.teacher.management.util.UniversityInvitationsScores;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/universityInvitations")
@RequiredArgsConstructor
public class UniversityInvitationController {
    private final UniversityInvitationService universityInvitationService;
    private final UniversityInvitationsScores universityInvitationsScores;
    @PostMapping("/addUniversityInvitation")
    public ResponseEntity<UniversityInvitation> saveUniversityInvitation(@RequestBody UniversityInvitation universityInvitation){
        universityInvitation.setPunctaj(universityInvitationsScores.getArticleScore(universityInvitation.getTipInvitatie()));
        universityInvitationService.save(universityInvitation);
        return new ResponseEntity<>(universityInvitation, HttpStatus.OK);

    }
    @GetMapping("/getUniversityInvitationsByUser/{tipInvitatie}/{userId}")
    public List<UniversityInvitation> getUniversityInvitationsByTipInvitatieAndUserId(@PathVariable String tipInvitatie, @PathVariable Integer userId){
        return universityInvitationService.findUniversityInvitationsByTipInvitatieAndIdUser(tipInvitatie,userId);
    }
}
