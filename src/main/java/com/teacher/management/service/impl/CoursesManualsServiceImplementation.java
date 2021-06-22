package com.teacher.management.service.impl;

import com.teacher.management.models.CoursesManuals;
import com.teacher.management.repository.CoursesManualsRepository;
import com.teacher.management.service.CoursesManualsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CoursesManualsServiceImplementation implements CoursesManualsService {
    private final CoursesManualsRepository coursesManualsRepository;
    @Override
    public CoursesManuals findByIdCourseManual(long idCourseManual) {
         return  coursesManualsRepository.findByIdCourseManual(idCourseManual);
    }

    @Override
    public CoursesManuals save(CoursesManuals coursesManuals) {
        return  coursesManualsRepository.save(coursesManuals);
    }

    @Override
    public List<CoursesManuals> findAll() {
        return coursesManualsRepository.findAll();
    }

    @Override
    public List<CoursesManuals> getCoursesManualsByTipCursManual(String tipCursManual) {
        return  coursesManualsRepository.getCoursesManualsByTipCursManual(tipCursManual);
    }

    @Override
    public List<CoursesManuals> getCoursesManualsByTipCursManualAndIdUser(String tipCursManual, Integer userId) {
        return coursesManualsRepository.getCoursesManualsByTipCursManualAndIdUser(tipCursManual,userId);
    }
}
