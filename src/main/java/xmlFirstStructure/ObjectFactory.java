//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.20 at 03:19:12 PM MSK 
//


package xmlFirstStructure;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xmlFirstStructure package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xmlFirstStructure
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link University }
     * 
     */
    public University createUniversity() {
        return new University();
    }

    /**
     * Create an instance of {@link University.Faculty }
     * 
     */
    public University.Faculty createUniversityFaculty() {
        return new University.Faculty();
    }

    /**
     * Create an instance of {@link University.Faculty.Cathedra }
     * 
     */
    public University.Faculty.Cathedra createUniversityFacultyCathedra() {
        return new University.Faculty.Cathedra();
    }

    /**
     * Create an instance of {@link University.Faculty.Cathedra.Group }
     * 
     */
    public University.Faculty.Cathedra.Group createUniversityFacultyCathedraGroup() {
        return new University.Faculty.Cathedra.Group();
    }

    /**
     * Create an instance of {@link University.Faculty.Cathedra.Group.Student }
     * 
     */
    public University.Faculty.Cathedra.Group.Student createUniversityFacultyCathedraGroupStudent() {
        return new University.Faculty.Cathedra.Group.Student();
    }

    /**
     * Create an instance of {@link University.Faculty.Cathedra.Group.Student.Subject }
     * 
     */
    public University.Faculty.Cathedra.Group.Student.Subject createUniversityFacultyCathedraGroupStudentSubject() {
        return new University.Faculty.Cathedra.Group.Student.Subject();
    }

    /**
     * Create an instance of {@link University.Faculty.Cathedra.Group.Student.Subject.Mark }
     * 
     */
    public University.Faculty.Cathedra.Group.Student.Subject.Mark createUniversityFacultyCathedraGroupStudentSubjectMark() {
        return new University.Faculty.Cathedra.Group.Student.Subject.Mark();
    }

}