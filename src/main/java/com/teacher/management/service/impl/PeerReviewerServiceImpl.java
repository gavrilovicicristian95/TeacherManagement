package com.teacher.management.service.impl;

import com.teacher.management.models.PeerReviewer;
import com.teacher.management.repository.PeerReviewerRepository;
import com.teacher.management.service.PeerReviewerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PeerReviewerServiceImpl implements PeerReviewerService {
    private final PeerReviewerRepository peerReviewerRepository;
    @Override
    public PeerReviewer save(PeerReviewer peerReviewer) {
        return peerReviewerRepository.save(peerReviewer);
    }

    @Override
    public List<PeerReviewer> findPeerReviewersByTipReferentAndIdUser(String tipReferent, Integer idUser) {
        return peerReviewerRepository.findPeerReviewersByTipReferentAndIdUser(tipReferent,idUser);
    }
}
