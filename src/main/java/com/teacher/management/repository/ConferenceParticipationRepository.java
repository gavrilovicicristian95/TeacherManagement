package com.teacher.management.repository;

import com.teacher.management.models.ConferenceParticipation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConferenceParticipationRepository extends JpaRepository<ConferenceParticipation, Long> {

    public ConferenceParticipation findByIdConferenceParticipation(long idConferenceParticipation);
    public ConferenceParticipation save(ConferenceParticipation conferenceParticipation);
    public List<ConferenceParticipation> findAll();
    public List<ConferenceParticipation> findConferenceParticipationByTipConferinta(String tipConferinta);
    public List<ConferenceParticipation> findConferenceParticipationsByTipConferintaAndIdUser(String tipConferinta, Integer userId);

}
