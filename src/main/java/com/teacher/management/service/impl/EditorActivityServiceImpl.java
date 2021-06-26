package com.teacher.management.service.impl;

import com.teacher.management.models.EditorActivity;
import com.teacher.management.repository.EditorActivityRepository;
import com.teacher.management.service.EditorActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EditorActivityServiceImpl implements EditorActivityService {
    private final EditorActivityRepository editorActivityRepository;

    @Override
    public EditorActivity save(EditorActivity editorActivity) {
        return editorActivityRepository.save(editorActivity);
    }

    @Override
    public List<EditorActivity> findEditorActivitiesByTipActivitateEditorialaAndIdUser(String tipActivitate, Integer userId) {
        return editorActivityRepository.findEditorActivitiesByTipActivitateEditorialaAndIdUser(tipActivitate,userId);
    }
}
