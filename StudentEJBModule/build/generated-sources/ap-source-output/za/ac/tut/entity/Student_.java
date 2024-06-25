package za.ac.tut.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.entity.Subjects;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-05-25T00:00:35")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, byte[]> image;
    public static volatile SingularAttribute<Student, String> gender;
    public static volatile SingularAttribute<Student, String> surname;
    public static volatile ListAttribute<Student, Subjects> subjects;
    public static volatile SingularAttribute<Student, String> name;
    public static volatile SingularAttribute<Student, Long> id;
    public static volatile SingularAttribute<Student, Date> creationDate;
    public static volatile SingularAttribute<Student, Integer> age;

}