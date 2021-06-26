package com.teacher.management.controllers;

import com.teacher.management.models.EditorActivity;
import com.teacher.management.models.ScientificWork;
import com.teacher.management.service.EditorActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/editorActivities")
@RequiredArgsConstructor
public class EditorActivityController {
    private final EditorActivityService editorActivityService;
    @PostMapping("/addEditorActivity")
    public ResponseEntity<EditorActivity> saveScientificWork(@RequestBody EditorActivity editorActivity){
        editorActivityService.save(editorActivity);
        return new ResponseEntity<>(editorActivity, HttpStatus.OK);
    }
    @GetMapping("/getEditorActivitiesByUser/{tipActivitate}/{userId}")
    public List<EditorActivity> EditorActivitiesByTipActivitateEditorialaAndIdUser(@PathVariable String tipActivitate, @PathVariable Integer userId){
        return editorActivityService.findEditorActivitiesByTipActivitateEditorialaAndIdUser(tipActivitate,userId);
    }
}
