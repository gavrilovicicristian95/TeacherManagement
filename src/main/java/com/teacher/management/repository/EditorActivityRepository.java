package com.teacher.management.repository;

import com.teacher.management.models.EditorActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EditorActivityRepository extends JpaRepository<EditorActivity,Long> {
    public EditorActivity save(EditorActivity editorActivity);
    public List<EditorActivity> findEditorActivitiesByTipActivitateEditorialaAndIdUser(String tipActivitate, Integer userId);
}
