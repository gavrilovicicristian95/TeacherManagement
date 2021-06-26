package com.teacher.management.repository;

import com.teacher.management.models.Commissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommissionsRepository extends JpaRepository<Commissions,Long> {
    public Commissions save(Commissions commissions);
    public List<Commissions> findCommissionsByTipComisieAndIdUser(String tipComisie, Integer idUser);
}
