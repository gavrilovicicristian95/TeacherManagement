package com.teacher.management.controllers;

import com.teacher.management.models.AcademyMember;
import com.teacher.management.models.ScientificWork;
import com.teacher.management.service.AcademyMemberService;
import com.teacher.management.util.AcademyMemberScores;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/academyMembers")
@RequiredArgsConstructor
public class AcademyMemberController {
    private final AcademyMemberService academyMemberService;
    private final AcademyMemberScores academyMemberScores;
    @PostMapping("/addAcademyMember")
    public ResponseEntity<AcademyMember> saveScientificWork(@RequestBody AcademyMember academyMember){
        academyMember.setPunctaj(academyMemberScores.getArticleScore(academyMember.getTipMembru()));
        academyMemberService.save(academyMember);
        return new ResponseEntity<>(academyMember, HttpStatus.OK);
    }
    @GetMapping("/getAcademyMembersByUser/{tipMembru}/{userId}")
    public List<AcademyMember> getAcademyMembersByTipMembruAndIdUser(@PathVariable String tipMembru, @PathVariable Integer userId){
        return academyMemberService.findAcademyMembersByTipMembruAndIdUser(tipMembru,userId);
    }
}
