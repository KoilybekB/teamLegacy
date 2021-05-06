package bcc.kz.legasy.schoolmiras.service.impl;

import bcc.kz.legasy.schoolmiras.model.Classes;
import bcc.kz.legasy.schoolmiras.model.Lessons;
import bcc.kz.legasy.schoolmiras.repository.ClassesRepository;
import bcc.kz.legasy.schoolmiras.repository.LessonsRepository;
import bcc.kz.legasy.schoolmiras.service.LessonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LessonsServiceImpl implements LessonsService {
    @Autowired
    private LessonsRepository lessonsRepository;

    @Override
    public Lessons create(Lessons lessons) {
        return lessonsRepository.save(lessons);
    }

    @Override
    public Lessons getById(Integer id) {
        Optional<Lessons> optionalLessons = lessonsRepository.findById(id);
        if (optionalLessons.isPresent()) {
            return lessonsRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<Lessons> getAll() {
        return lessonsRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        Lessons lessons = getById(id);
        if (lessons != null)
            lessonsRepository.delete(lessons);
    }

}
