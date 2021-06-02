package com.teacher.management.service;

import com.teacher.management.models.Patent;

import java.util.List;

public interface PatentService {

    public Patent findPatentByIdPatent(long idPatent);
    public Patent save(Patent patent);
    public List<Patent> findAll();
    public List<Patent> findPatentByTipBrevet(String brevet);
}
