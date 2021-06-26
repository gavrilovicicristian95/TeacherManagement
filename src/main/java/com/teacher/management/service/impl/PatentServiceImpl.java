package com.teacher.management.service.impl;

import com.teacher.management.models.Patent;
import com.teacher.management.repository.PatentRepository;
import com.teacher.management.service.PatentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatentServiceImpl implements PatentService {

    private final PatentRepository patentRepository;

    @Override
    public Patent findPatentByIdPatent(long idPatent) {
        return patentRepository.findPatentByIdPatent(idPatent);
    }

    @Override
    public Patent save(Patent patent) {
        return patentRepository.save(patent);
    }

    @Override
    public List<Patent> findAll() {
        return patentRepository.findAll();
    }

    @Override
    public List<Patent> findPatentByTipBrevet(String brevet) {
        return patentRepository.findPatentByTipBrevet(brevet);
    }

    @Override
    public List<Patent> findPatentsByTipBrevetAndIdUser(String tipBrevet, Integer userId) {
        return patentRepository.findPatentsByTipBrevetAndIdUser(tipBrevet, userId);
    }
}
