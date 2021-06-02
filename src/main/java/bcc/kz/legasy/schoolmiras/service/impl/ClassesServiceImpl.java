package bcc.kz.legasy.schoolmiras.service.impl;

import bcc.kz.legasy.schoolmiras.model.Classes;
import bcc.kz.legasy.schoolmiras.repository.ClassesRepository;
import bcc.kz.legasy.schoolmiras.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassesServiceImpl implements ClassesService {
    @Autowired
    private ClassesRepository classesRepository;

    @Override
    public Classes create(Classes classes) {
        return classesRepository.save(classes);
    }

    @Override
    public Classes getById(Integer id) {
        Optional<Classes> optionalClasses = classesRepository.findById(id);
        if (optionalClasses.isPresent()) {
            return classesRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<Classes> getAll() {
        return classesRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        Classes classes = getById(id);
        if (classes != null)
            classesRepository.delete(classes);
    }

}
