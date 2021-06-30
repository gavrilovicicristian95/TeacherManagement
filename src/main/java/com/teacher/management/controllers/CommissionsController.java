package com.teacher.management.controllers;

import com.teacher.management.models.Commissions;
import com.teacher.management.models.ScientificWork;
import com.teacher.management.service.CommissionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/commissions")
@RequiredArgsConstructor
public class CommissionsController {
    private final CommissionsService commissionsService;
    @PostMapping("/addCommission")
    public ResponseEntity<Commissions> saveCommission(@RequestBody Commissions commissions){
        String tipComisie=commissions.getTipComisie();
        if(tipComisie.equalsIgnoreCase("membruComisiiUniversitateAvizateSenat")){
            commissions.setPunctaj(10);
        }
        if(tipComisie.equalsIgnoreCase("membruComisiiConcursPostDidactic")){
            commissions.setPunctaj(5);
        }
        if(tipComisie.equalsIgnoreCase("membruComisiiDoctoratStrainatate")){
            commissions.setPunctaj(10);
        }
        if(tipComisie.equalsIgnoreCase("membruComisiiDoctoratTara")){
            commissions.setPunctaj(5);
        }
        commissionsService.save(commissions);
        return new ResponseEntity<>(commissions, HttpStatus.OK);
    }
    @GetMapping("/getCommissionsByUser/{tipComisie}/{userId}")
    public List<Commissions> getCommissionsByTipComisieAndIdUser(@PathVariable String tipComisie, @PathVariable Integer userId){
        return commissionsService.findCommissionsByTipComisieAndIdUser(tipComisie, userId);
    }
}
