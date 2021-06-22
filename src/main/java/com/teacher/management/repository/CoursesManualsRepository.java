package com.teacher.management.repository;

import com.teacher.management.models.CoursesManuals;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursesManualsRepository extends JpaRepository<CoursesManuals,Long> {
    public CoursesManuals findByIdCourseManual(long idCourseManual);
    public CoursesManuals save(CoursesManuals coursesManuals);
    public List<CoursesManuals> findAll();
    public List<CoursesManuals> getCoursesManualsByTipCursManual(String tipCursManual);
    public List<CoursesManuals> getCoursesManualsByTipCursManualAndIdUser(String tipCursManual, Integer userId);
}
