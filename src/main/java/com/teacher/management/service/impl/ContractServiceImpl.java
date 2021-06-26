package com.teacher.management.service.impl;

import com.teacher.management.models.Contract;
import com.teacher.management.repository.ContractRepository;
import com.teacher.management.service.ContractService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContractServiceImpl implements ContractService {

    private final ContractRepository contractRepository;

    @Override
    public Contract findByIdContract(long idContract) {
        return contractRepository.findByIdContract(idContract);
    }

    @Override
    public Contract save(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public List<Contract> findContractByTipContract(String tipContract) {
        return contractRepository.findContractByTipContract(tipContract);
    }

    @Override
    public List<Contract> findContractsByTipContractAndIdUser(String tipContract, Integer userId) {
        return contractRepository.findContractsByTipContractAndIdUser(tipContract, userId);
    }
}
