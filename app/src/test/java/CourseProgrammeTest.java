import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CourseProgrammeTest 
{
  @Test
  void returnsCorrectName()
  {
    // Arrange.
    CourseProgramme course = new CourseProgramme("Bachelor and Master of Engineering (Energy Systems)", DateTime.parse("2022-09-01"), DateTime.parse("2023-05-01"));

    // Act.
    String name = course.getName();

    // Assert.
    assertEquals("Bachelor and Master of Engineering (Energy Systems)", name);
  }

  @Test 
  void returnsCorrectModuleCount()
  {
    // Arrange.
    Lecturer l1 = new Lecturer("Jaydon Groeber", DateTime.parse("1969-08-04"), 1135632);

    Module m1 = new Module("Cryptography", "CS402", l1);
    Module m2 = new Module("Graphics & Image Process", "CT404", l1);
    Module m3 = new Module("Real Time Systems", "CT420", l1);

    ArrayList<Module> modules = new ArrayList<>();
    modules.add(m1);
    modules.add(m2);
    modules.add(m3);

    CourseProgramme course = new CourseProgramme("Bachelor and Master of Engineering (Energy Systems)", DateTime.parse("2022-09-01"), DateTime.parse("2023-05-01"));
    course.setModules(modules);

    // Act.
    int moduleCount = course.getModules().size();

    // Assert.
    assertEquals(3, moduleCount);
  }

  @Test
  void returnsCorrectStudentCount()
  {
    // Arrange.
    CourseProgramme course = new CourseProgramme("Bachelor and Master of Engineering (Energy Systems)", DateTime.parse("2022-09-01"), DateTime.parse("2023-05-01"));

    Student s1 = new Student("Carlos Boswink", DateTime.parse("2002-05-21"), 19356781);
    Student s2 = new Student("Emauel Reguter", DateTime.parse("2001-03-15"), 19356785);
    Student s3 = new Student("Jazlyn Hutchin", DateTime.parse("1993-08-23"), 19358274);

    course.addStudent(s1);
    course.addStudent(s2);
    course.addStudent(s3);

    // Act.
    int studentCount = course.getStudents().size();

    // Assert.
    assertEquals(3, studentCount);
  }

  @Test
  void returnsCorrectStartDate()
  {
    // Arrange.
    CourseProgramme course = new CourseProgramme("Bachelor and Master of Engineering (Energy Systems)", DateTime.parse("2022-09-01"), DateTime.parse("2023-05-01"));

    // Act.
    DateTime startDate = course.getStartDate();

    // Assert.
    assertEquals(DateTime.parse("2022-09-01"), startDate);
  }


  @Test 
  void returnsCorrectEndDate()
  {
    // Arrange.
    CourseProgramme course = new CourseProgramme("Bachelor and Master of Engineering (Energy Systems)", DateTime.parse("2022-09-01"), DateTime.parse("2023-05-01"));

    // Act.
    DateTime endDate = course.getEndDate();

    // Assert.
    assertEquals(DateTime.parse("2023-05-01"), endDate);
  }
}
