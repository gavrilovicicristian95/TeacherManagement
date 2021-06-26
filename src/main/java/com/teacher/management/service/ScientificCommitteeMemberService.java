package com.teacher.management.service;

import com.teacher.management.models.ScientificCommitteeMember;

import java.util.List;

public interface ScientificCommitteeMemberService {
    public ScientificCommitteeMember save(ScientificCommitteeMember scientificCommitteeMember);
    public List<ScientificCommitteeMember> findScientificCommitteeMembersByTipMembruComitetAndIdUser(String tipMembru, Integer idUser);
    public ScientificCommitteeMember deleteScientificCommitteeMemberByIdCommitteeMember(long idCommitteeMember);
}
