package com.teacher.management.service.impl;

import com.teacher.management.models.Citation;
import com.teacher.management.repository.CitationRepository;
import com.teacher.management.service.CitationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CitationServiceImpl implements CitationService {

    private final CitationRepository citationRepository;

    @Override
    public Citation findByIdCitation(long idCitation) {
        return citationRepository.findByIdCitation(idCitation);
    }

    @Override
    public Citation save(Citation citation) {
        return citationRepository.save(citation);
    }

    @Override
    public List<Citation> findAll() {
        return citationRepository.findAll();
    }

    @Override
    public List<Citation> getCitationByTipCitatie(String tipCitatie) {
        return citationRepository.getCitationByTipCitatie(tipCitatie);
    }

    @Override
    public List<Citation> getCitationsByTipCitatieAndIdUser(String tipCitatie, Integer userId) {
        return citationRepository.getCitationsByTipCitatieAndIdUser(tipCitatie, userId);
    }
}
