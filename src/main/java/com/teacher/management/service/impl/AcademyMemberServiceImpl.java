package com.teacher.management.service.impl;

import com.teacher.management.models.AcademyMember;
import com.teacher.management.repository.AcademyMemberRepository;
import com.teacher.management.service.AcademyMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AcademyMemberServiceImpl implements AcademyMemberService {
    private final AcademyMemberRepository academyMemberRepository;
    @Override
    public AcademyMember save(AcademyMember academyMember) {
        return academyMemberRepository.save(academyMember);
    }

    @Override
    public List<AcademyMember> findAcademyMembersByTipMembruAndIdUser(String tipMembru, Integer idUser) {
        return academyMemberRepository.findAcademyMembersByTipMembruAndIdUser(tipMembru,idUser);
    }
}
