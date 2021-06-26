package com.teacher.management.repository;

import com.teacher.management.models.AcademyMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AcademyMemberRepository extends JpaRepository<AcademyMember,Long> {
    public AcademyMember save(AcademyMember academyMember);
    public List<AcademyMember> findAcademyMembersByTipMembruAndIdUser(String tipMembru, Integer idUser);
}
