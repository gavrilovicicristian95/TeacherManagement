package com.teacher.management.service;

import com.teacher.management.models.UniversityInvitation;

import java.util.List;

public interface UniversityInvitationService {

    public UniversityInvitation findUniversityInvitationByIdUniversityInvitations(long idUniversityInvitation);
    public UniversityInvitation save(UniversityInvitation universityInvitation);
    public List<UniversityInvitation> findAll();
    public List<UniversityInvitation> findUniversityInvitationByTipInvitatie(String invitatie);
}
