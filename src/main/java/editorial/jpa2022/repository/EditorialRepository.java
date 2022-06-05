/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package editorial.jpa2022.repository;

import editorial.jpa2022.entity.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lisbeth
 */
@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Integer> {
    
}
