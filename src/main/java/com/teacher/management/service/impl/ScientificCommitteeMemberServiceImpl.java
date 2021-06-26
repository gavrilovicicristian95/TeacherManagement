package com.teacher.management.service.impl;

import com.teacher.management.models.ScientificCommitteeMember;
import com.teacher.management.repository.ScientificCommitteeMemberRepository;
import com.teacher.management.service.ScientificCommitteeMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScientificCommitteeMemberServiceImpl implements ScientificCommitteeMemberService {
    private final ScientificCommitteeMemberRepository scientificCommitteeMemberRepository;
    @Override
    public ScientificCommitteeMember save(ScientificCommitteeMember scientificCommitteeMember) {
        return scientificCommitteeMemberRepository.save(scientificCommitteeMember);
    }

    @Override
    public List<ScientificCommitteeMember> findScientificCommitteeMembersByTipMembruComitetAndIdUser(String tipMembru, Integer idUser) {
        return scientificCommitteeMemberRepository.findScientificCommitteeMembersByTipMembruComitetAndIdUser(tipMembru,idUser);
    }

    @Override
    public ScientificCommitteeMember deleteScientificCommitteeMemberByIdCommitteeMember(long idCommitteeMember) {
        return scientificCommitteeMemberRepository.deleteScientificCommitteeMemberByIdCommitteeMember(idCommitteeMember);
    }
}
