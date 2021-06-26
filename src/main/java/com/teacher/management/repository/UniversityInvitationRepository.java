package com.teacher.management.repository;

import com.teacher.management.models.UniversityInvitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversityInvitationRepository extends JpaRepository<UniversityInvitation, Long> {

    public UniversityInvitation findUniversityInvitationByIdUniversityInvitations(long idUniversityInvitation);
    public UniversityInvitation save(UniversityInvitation universityInvitation);
    public List<UniversityInvitation> findAll();
    public List<UniversityInvitation> findUniversityInvitationByTipInvitatie(String invitatie);
    public List<UniversityInvitation> findUniversityInvitationsByTipInvitatieAndIdUser(String tipInvitatie, Integer idUser);
}
