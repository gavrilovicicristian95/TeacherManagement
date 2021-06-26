package com.teacher.management.repository;

import com.teacher.management.models.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {

    public Contract findByIdContract(long idContract);
    public Contract save(Contract contract);
    public List<Contract> findAll();
    public List<Contract> findContractByTipContract(String tipContract);
    public List<Contract> findContractsByTipContractAndIdUser(String tipContract, Integer userId);
}
