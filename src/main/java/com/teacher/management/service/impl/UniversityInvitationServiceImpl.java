package com.teacher.management.service.impl;

import com.teacher.management.models.UniversityInvitation;
import com.teacher.management.repository.UniversityInvitationRepository;
import com.teacher.management.service.UniversityInvitationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UniversityInvitationServiceImpl implements UniversityInvitationService {

    private final UniversityInvitationRepository universityInvitationRepository;

    @Override
    public UniversityInvitation findUniversityInvitationByIdUniversityInvitations(long idUniversityInvitation) {
        return universityInvitationRepository.findUniversityInvitationByIdUniversityInvitations(idUniversityInvitation);
    }

    @Override
    public UniversityInvitation save(UniversityInvitation universityInvitation) {
        return universityInvitationRepository.save(universityInvitation);
    }

    @Override
    public List<UniversityInvitation> findAll() {
        return universityInvitationRepository.findAll();
    }

    @Override
    public List<UniversityInvitation> findUniversityInvitationByTipInvitatie(String invitatie) {
        return universityInvitationRepository.findUniversityInvitationByTipInvitatie(invitatie);
    }

    @Override
    public List<UniversityInvitation> findUniversityInvitationsByTipInvitatieAndIdUser(String tipInvitatie, Integer idUser) {
        return universityInvitationRepository.findUniversityInvitationsByTipInvitatieAndIdUser(tipInvitatie,idUser);
    }
}
