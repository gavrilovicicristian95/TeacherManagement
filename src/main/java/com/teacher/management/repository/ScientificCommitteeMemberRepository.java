package com.teacher.management.repository;

import com.teacher.management.models.ScientificCommitteeMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScientificCommitteeMemberRepository extends JpaRepository<ScientificCommitteeMember,Long> {
    public ScientificCommitteeMember save(ScientificCommitteeMember scientificCommitteeMember);
    public List<ScientificCommitteeMember> findScientificCommitteeMembersByTipMembruComitetAndIdUser(String tipMembru, Integer idUser);
    public ScientificCommitteeMember deleteScientificCommitteeMemberByIdCommitteeMember(long idCommitteeMember);
}
