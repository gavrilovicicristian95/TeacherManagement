package com.teacher.management.service;

import com.teacher.management.models.Contract;

import java.util.List;

public interface ContractService {

    public Contract findByIdContract(long idContract);
    public Contract save(Contract contract);
    public List<Contract> findAll();
    public List<Contract> findContractByTipContract(String tipContract);
    public List<Contract> findContractsByTipContractAndIdUser(String tipContract, Integer userId);
}
