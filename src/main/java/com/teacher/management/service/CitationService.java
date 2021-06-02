package com.teacher.management.service;

import com.teacher.management.models.Citation;

import java.util.List;

public interface CitationService {

    public Citation findByIdCitation(long idCitation);
    public Citation save(Citation citation);
    public List<Citation> findAll();
    public List<Citation> getCitationByTipCitatie(String tipCitatie);
}
