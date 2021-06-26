package com.teacher.management.service;

import com.teacher.management.models.PeerReviewer;

import java.util.List;

public interface PeerReviewerService {
    public PeerReviewer save(PeerReviewer peerReviewer);
    public List<PeerReviewer> findPeerReviewersByTipReferentAndIdUser(String tipReferent, Integer idUser);
}
