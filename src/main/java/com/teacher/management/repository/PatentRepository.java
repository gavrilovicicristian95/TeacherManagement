package com.teacher.management.repository;

import com.teacher.management.models.Patent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatentRepository extends JpaRepository<Patent, Long> {

    public Patent findPatentByIdPatent(long idPatent);
    public Patent save(Patent patent);
    public List<Patent> findAll();
    public List<Patent> findPatentByTipBrevet(String brevet);
}
