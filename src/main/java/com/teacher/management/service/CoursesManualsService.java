package com.teacher.management.service;

import com.teacher.management.models.CoursesManuals;

import java.util.List;

public interface CoursesManualsService {
    public CoursesManuals findByIdCourseManual(long idCourseManual);
    public CoursesManuals save(CoursesManuals coursesManuals);
    public List<CoursesManuals> findAll();
    public List<CoursesManuals> getCoursesManualsByTipCursManual(String tipCursManual);
    public List<CoursesManuals> getCoursesManualsByTipCursManualAndIdUser(String tipCursManual, Integer userId);
}
