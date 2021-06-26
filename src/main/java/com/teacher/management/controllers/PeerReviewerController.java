package com.teacher.management.controllers;

import com.teacher.management.models.PeerReviewer;
import com.teacher.management.models.ScientificWork;
import com.teacher.management.service.PeerReviewerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/peerReviewers")
@RequiredArgsConstructor
public class PeerReviewerController {
    private final PeerReviewerService peerReviewerService;
    @PostMapping("/addPeerReviewer")
    public ResponseEntity<PeerReviewer> saveScientificWork(@RequestBody PeerReviewer peerReviewer){
        peerReviewerService.save(peerReviewer);
        return new ResponseEntity<>(peerReviewer, HttpStatus.OK);
    }
    @GetMapping("/getPeerReviewersByUser/{tipReferent}/{userId}")
    public List<PeerReviewer> getPeerReviewersByTipReferentAndIdUserd(@PathVariable String tipReferent, @PathVariable Integer userId){
        return peerReviewerService.findPeerReviewersByTipReferentAndIdUser(tipReferent, userId);
    }
}
