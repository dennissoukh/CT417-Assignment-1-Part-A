import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class ModuleTest 
{
  @Test
  void returnsCorrectName()
  {
    // Arrange.
    Lecturer l1 = new Lecturer("Jaydon Groeber", DateTime.parse("1969-08-04"), 1135632);
    Module module = new Module("Cryptography", "CS402", l1);

    // Act.
    String name = module.getName();

    // Assert.
    assertEquals("Cryptography", name);
  }

  @Test
  void returnsCorrectId()
  {
    // Arrange.
    Lecturer l1 = new Lecturer("Jaydon Groeber", DateTime.parse("1969-08-04"), 1135632);
    Module module = new Module("Cryptography", "CS402", l1);

    // Act.
    String id = module.getId();

    // Assert.
    assertEquals("CS402", id);
  }

  @Test
  void returnsCorrectStudentCount()
  {
    // Arrange.
    Student s1 = new Student("Carlos Boswink", DateTime.parse("2002-05-21"), 19356781);
    Student s2 = new Student("Emauel Reguter", DateTime.parse("2001-03-15"), 19356785);
    Student s3 = new Student("Jazlyn Hutchin", DateTime.parse("1993-08-23"), 19358274);

    ArrayList<Student> students = new ArrayList<>();
    students.add(s1);
    students.add(s2);
    students.add(s3);

    Lecturer l1 = new Lecturer("Jaydon Groeber", DateTime.parse("1969-08-04"), 1135632);

    Module module = new Module("Cryptography", "CS402", l1);
    module.setStudents(students);

    // Act.
    int studentCount = module.getStudents().size();

    // Assert.
    assertEquals(3, studentCount);
  }

  @Test
  void returnsCorrectCourseProgrammeCount()
  {
    // Arrange.
    Lecturer l1 = new Lecturer("Jaydon Groeber", DateTime.parse("1969-08-04"), 1135632);
    CourseProgramme c1 = new CourseProgramme("Bachelor and Master of Engineering (Energy Systems)", DateTime.parse("2022-09-01"), DateTime.parse("2023-05-01"));

    Module module = new Module("Cryptography", "CS402", l1);

    module.addCourseProgramme(c1);

    // Act.
    int courseCount = module.getCourseProgramme().size();

    // Assert.
    assertEquals(1, courseCount);
  }
  
  @Test 
  void returnsCorrectLecturerId()
  {
    // Arrange.
    Lecturer l1 = new Lecturer("Jaydon Groeber", DateTime.parse("1969-08-04"), 1135632);
    Module module = new Module("Cryptography", "CS402", l1);

    // Act.
    Lecturer moduleLecturer = module.getLecturer();

    // Assert.
    assertEquals(l1.getId(), moduleLecturer.getId());
  }
}
