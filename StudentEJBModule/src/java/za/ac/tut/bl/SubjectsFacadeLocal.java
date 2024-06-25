/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entity.Subjects;

/**
 *
 * @author Student
 */
@Local
public interface SubjectsFacadeLocal {

    void create(Subjects subjects);

    void edit(Subjects subjects);

    void remove(Subjects subjects);

    Subjects find(Object id);

    List<Subjects> findAll();

    List<Subjects> findRange(int[] range);

    int count();
    
}
