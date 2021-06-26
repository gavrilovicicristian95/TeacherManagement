package com.teacher.management.controllers;

import com.teacher.management.models.ScientificCommitteeMember;
import com.teacher.management.models.ScientificWork;
import com.teacher.management.service.ScientificCommitteeMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/committeeMembers")
@RequiredArgsConstructor
public class ScientificCommitteeMemberController {
    private final ScientificCommitteeMemberService scientificCommitteeMemberService;
    @PostMapping("/addCommitteeMember")
    public ResponseEntity<ScientificCommitteeMember> saveCommitteeMember(@RequestBody ScientificCommitteeMember scientificCommitteeMember){
        scientificCommitteeMemberService.save(scientificCommitteeMember);
        return new ResponseEntity<>(scientificCommitteeMember, HttpStatus.OK);
    }
    @GetMapping("/getCommitteeMembers/{tipMembruComitet}/{userId}")
    public List<ScientificCommitteeMember> getCommitteeMembersyTipMembruComitetAndIdUserd(@PathVariable String tipMembruComitet, @PathVariable Integer userId){
        return scientificCommitteeMemberService.findScientificCommitteeMembersByTipMembruComitetAndIdUser(tipMembruComitet,userId);
    }

}
