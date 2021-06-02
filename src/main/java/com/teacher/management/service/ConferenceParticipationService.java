package com.teacher.management.service;

import com.teacher.management.models.ConferenceParticipation;

import java.util.List;

public interface ConferenceParticipationService {

    public ConferenceParticipation findByIdConferenceParticipation(long idConferenceParticipation);
    public ConferenceParticipation save(ConferenceParticipation conferenceParticipation);
    public List<ConferenceParticipation> findAll();
    public List<ConferenceParticipation> findConferenceParticipationByTipConferinta(String tipConferinta);
}
