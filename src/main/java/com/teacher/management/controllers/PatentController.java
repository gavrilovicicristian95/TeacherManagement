package com.teacher.management.controllers;
import com.teacher.management.models.Book;
import com.teacher.management.models.Patent;
import com.teacher.management.service.BookService;
import com.teacher.management.service.PatentService;
import com.teacher.management.util.PatentScores;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/patents")
@RequiredArgsConstructor
public class PatentController {
    private final PatentService patentService;
    private final PatentScores patentScores;

    @PostMapping("/addPatent")
    public ResponseEntity<Patent> savePatent(@RequestBody Patent patent){
        patentService.save(patent);
        patent.setPunctaj(patentScores.getArticleScore(patent.getNrAutori(),patent.getTipBrevet()));
        return new ResponseEntity<>(patent, HttpStatus.OK);
    }

    @GetMapping("/getPatent/{idPatent}")
    public Patent findByIdPatent(@PathVariable int idPatent){
        return patentService.findPatentByIdPatent(idPatent);
    }

    @GetMapping("/getAllPatents")
    public List<Patent> getAllPatents(){
        return patentService.findAll();
    }

    @GetMapping("/getPatents/{tipBrevet}")
    public List<Patent> getPatentsByTipPatent(@PathVariable String tipBrevet){
        return patentService.findPatentByTipBrevet(tipBrevet);
    }
    @GetMapping("/getPatentsByUser/{tipBrevet}/{idUser}")
    public List<Patent> getPatentsByTipPatentAndUserId(@PathVariable String tipBrevet,@PathVariable Integer idUser){
        return patentService.findPatentsByTipBrevetAndIdUser(tipBrevet, idUser);
    }
}
