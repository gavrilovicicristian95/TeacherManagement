package com.teacher.management.service;

import com.teacher.management.models.Commissions;

import java.util.List;

public interface CommissionsService {
    public Commissions save(Commissions commissions);
    public List<Commissions> findCommissionsByTipComisieAndIdUser(String tipComisie, Integer idUser);
}
