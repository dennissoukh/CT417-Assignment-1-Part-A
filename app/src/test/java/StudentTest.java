import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest 
{
  @Test
  void returnsCorrectUsername()
  {
    // Arrange.
    Student student = new Student("John", DateTime.parse("2001-05-11"), 5);

    // Act.
    String username = student.getUsername();

    // Assert.
    assertEquals("John21", username);
  }

  @Test
  void returnsCorrectName()
  {
    // Arrange.
    Student student = new Student("Daniel", DateTime.parse("2000-05-11"), 5);

    // Act.
    String name = student.getName();

    // Assert.
    assertEquals("Daniel", name);
  }

  @Test 
  void returnsCorrectAge()
  {
    // Arrange.
    Student student = new Student("Daniel", DateTime.parse("2000-05-11"), 5);

    // Act.
    int age = student.getAge();

    // Assert.
    assertEquals(22, age);
  }

  @Test 
  void returnsCorrectDateOfBirth()
  {
    // Arrange.
    Student student = new Student("Daniel", DateTime.parse("2000-05-11"), 5);

    // Act.
    DateTime dob = student.getDateOfBirth();

    // Assert.
    assertEquals(DateTime.parse("2000-05-11"), dob);
  }

  @Test 
  void returnsCorrectId()
  {
    // Arrange.
    Student student = new Student("Alex", DateTime.parse("2000-05-11"), 22);

    // Act.
    long id = student.getId();

    // Assert.
    assertEquals(22, id);
  }

  @Test 
  void returnsCorrectModuleCount()
  {
    // Arrange.
    Student student = new Student("Alex", DateTime.parse("2000-05-11"), 22);

    Lecturer lecturer = new Lecturer("Frank", DateTime.parse("2001-06-10"), 15);

    Module m1 = new Module("Cryptography", "CS402", lecturer);
    Module m2 = new Module("Graphics & Image Process", "CT404", lecturer);
    Module m3 = new Module("Real Time Systems", "CT420", lecturer);

    student.addModule(m1);
    student.addModule(m2);
    student.addModule(m3);

    // Act.
    int moduleCount = student.getModules().size();

    // Assert.
    assertEquals(3, moduleCount);
  }

  @Test 
  void returnsCorrectCourseCount()
  {
    // Arrange.
    Student student = new Student("Alex", DateTime.parse("2000-05-11"), 22);
    
    CourseProgramme c1 = new CourseProgramme("Bachelor and Master of Engineering (Energy Systems)", DateTime.parse("2022-09-01"), DateTime.parse("2023-05-01"));
  
    c1.addStudent(student);
    student.addCourse(c1);

    // Act.
    int courseCount = student.getCourses().size();

    // Assert.
    assertEquals(1, courseCount);
  }
}
