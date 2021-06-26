package com.teacher.management.service.impl;

import com.teacher.management.models.ConferenceParticipation;
import com.teacher.management.repository.ConferenceParticipationRepository;
import com.teacher.management.service.ConferenceParticipationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConferenceParticipationServiceImpl implements ConferenceParticipationService {

    private final ConferenceParticipationRepository conferenceParticipationRepository;

    @Override
    public ConferenceParticipation findByIdConferenceParticipation(long idConferenceParticipation) {
        return conferenceParticipationRepository.findByIdConferenceParticipation(idConferenceParticipation);
    }

    @Override
    public ConferenceParticipation save(ConferenceParticipation conferenceParticipation) {
        return conferenceParticipationRepository.save(conferenceParticipation);
    }

    @Override
    public List<ConferenceParticipation> findAll() {
        return conferenceParticipationRepository.findAll();
    }

    @Override
    public List<ConferenceParticipation> findConferenceParticipationByTipConferinta(String tipConferinta) {
        return conferenceParticipationRepository.findConferenceParticipationByTipConferinta(tipConferinta);
    }

    @Override
    public List<ConferenceParticipation> findConferenceParticipationsByTipConferintaAndIdUser(String tipConferinta, Integer userId) {
        return conferenceParticipationRepository.findConferenceParticipationsByTipConferintaAndIdUser(tipConferinta, userId);
    }
}
