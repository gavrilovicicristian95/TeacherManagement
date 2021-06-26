package com.teacher.management.service.impl;

import com.teacher.management.models.Commissions;
import com.teacher.management.repository.CommissionsRepository;
import com.teacher.management.service.CommissionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommissionsServiceImpl implements CommissionsService {
    private final CommissionsRepository commissionsRepository;

    @Override
    public Commissions save(Commissions commissions) {
        return commissionsRepository.save(commissions);
    }

    @Override
    public List<Commissions> findCommissionsByTipComisieAndIdUser(String tipComisie, Integer idUser) {
        return commissionsRepository.findCommissionsByTipComisieAndIdUser(tipComisie, idUser);
    }
}
