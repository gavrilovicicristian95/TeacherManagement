package com.teacher.management.controllers;

import com.teacher.management.models.Book;
import com.teacher.management.models.Contract;
import com.teacher.management.service.ContractService;
import com.teacher.management.util.ContractScores;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/contracts")
@RequiredArgsConstructor
public class ContractController {
    private final ContractService contractService;
    private final ContractScores contractScores;
    @PostMapping("/addContract")
    public ResponseEntity<Contract> saveContract(@RequestBody Contract contract){
        contract.setPunctaj(contractScores.getArticleScore(contract.getValoareLeiContract(),contract.getTipContract(),contract.getNrMembrilor()));
        contractService.save(contract);
        return new ResponseEntity<>(contract, HttpStatus.OK);
    }
    @GetMapping("/getContract/{idContract}")
    public Contract findByIdContract(@PathVariable int idContract){
        return contractService.findByIdContract(idContract);
    }

    @GetMapping("/getAllContracts")
    public List<Contract> getAllContracts(){
        return contractService.findAll();
    }

    @GetMapping("/getContracts/{tipContract}")
    public List<Contract> getContractsByTipContract(@PathVariable String tipContract){
        return contractService.findContractByTipContract(tipContract);
    }

}
