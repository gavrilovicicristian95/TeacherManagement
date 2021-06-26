package com.teacher.management.repository;

import com.teacher.management.models.PeerReviewer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeerReviewerRepository extends JpaRepository<PeerReviewer,Long> {
    public PeerReviewer save(PeerReviewer peerReviewer);
    public List<PeerReviewer> findPeerReviewersByTipReferentAndIdUser(String tipReferent, Integer idUser);
}
