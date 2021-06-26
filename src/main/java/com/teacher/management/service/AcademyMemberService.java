package com.teacher.management.service;

import com.teacher.management.models.AcademyMember;

import java.util.List;

public interface AcademyMemberService {
    public AcademyMember save(AcademyMember academyMember);
    public List<AcademyMember> findAcademyMembersByTipMembruAndIdUser(String tipMembru, Integer idUser);
}
