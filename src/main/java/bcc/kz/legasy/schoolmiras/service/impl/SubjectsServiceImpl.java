package bcc.kz.legasy.schoolmiras.service.impl;

import bcc.kz.legasy.schoolmiras.model.Classes;
import bcc.kz.legasy.schoolmiras.model.Subjects;
import bcc.kz.legasy.schoolmiras.repository.ClassesRepository;
import bcc.kz.legasy.schoolmiras.repository.SubjectsRepository;
import bcc.kz.legasy.schoolmiras.service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectsServiceImpl implements SubjectsService {
    @Autowired
    private SubjectsRepository subjectsRepository;

    @Override
    public Subjects create(Subjects subjects) {
        return subjectsRepository.save(subjects);
    }

    @Override
    public Subjects getById(Integer id) {
        Optional<Subjects> optionalSubjects = subjectsRepository.findById(id);
        if (optionalSubjects.isPresent()) {
            return subjectsRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<Subjects> getAll() {
        return subjectsRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        Subjects subjects = getById(id);
        if (subjects != null)
            subjectsRepository.delete(subjects);
    }

}
