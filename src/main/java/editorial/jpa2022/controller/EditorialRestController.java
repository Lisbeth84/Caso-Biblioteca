/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editorial.jpa2022.controller;

import editorial.jpa2022.entity.Editorial;
import editorial.jpa2022.service.EditorialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lisbeth
 */
@RestController
@RequestMapping("/editorial")
public class EditorialRestController {

    @Autowired
    private EditorialService editorialService;

    @GetMapping("/all")
    public List<Editorial> getEditorial() {
        return editorialService.readAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Editorial> getEditorial(@PathVariable int id) {
        Editorial editorial = editorialService.read(id);
        return ResponseEntity.ok(editorial);
    }

    @DeleteMapping("/{id}")
    public void deleteEditorial(@PathVariable int id) {
        editorialService.delete(id);
    }

    @PostMapping("/add")
    public Editorial addEditorial(@RequestBody Editorial editorial) {
        return editorialService.create(editorial);
    }

    @PutMapping("/edit")
    public Editorial editEditorial(@RequestBody Editorial editorial) {
        Editorial edit = new Editorial(editorial.getId(),editorial.getNombre(), editorial.getPais());
        System.out.println(editorial.getId()+" , "+editorial.getNombre()+" , "+editorial.getPais());
        return editorialService.update(editorial);
    }
 
}
