/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editorial.jpa2022.serviceImpl;

import editorial.jpa2022.entity.Editorial;
import editorial.jpa2022.repository.EditorialRepository;
import editorial.jpa2022.service.EditorialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lisbeth
 */
@Service

public class EditorialServiceImpl implements EditorialService {

    @Autowired
    private EditorialRepository editorialRepository;

    @Override
    public Editorial create(Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    @Override
    public Editorial update(Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    @Override
    public void delete(int id) {
        editorialRepository.deleteById(id);
    }

    @Override
    public Editorial read(int id) {
        return editorialRepository.findById(id).get();
    }

    @Override
    public List<Editorial> readAll() {
        return editorialRepository.findAll();
    }

}
