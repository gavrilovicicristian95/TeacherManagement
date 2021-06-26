package com.teacher.management.service;

import com.teacher.management.models.EditorActivity;

import java.util.List;

public interface EditorActivityService {
    public EditorActivity save(EditorActivity editorActivity);
    public List<EditorActivity> findEditorActivitiesByTipActivitateEditorialaAndIdUser(String tipActivitate, Integer userId);
}
