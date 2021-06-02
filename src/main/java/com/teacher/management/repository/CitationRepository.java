package com.teacher.management.repository;

import com.teacher.management.models.Citation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitationRepository extends JpaRepository<Citation, Long> {

    public Citation findByIdCitation(long idCitation);
    public Citation save(Citation citation);
    public List<Citation> findAll();
    public List<Citation> getCitationByTipCitatie(String tipCitatie);
}
