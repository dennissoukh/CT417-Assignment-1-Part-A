import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class LecturerTest 
{
  @Test
  void returnsCorrectUsername()
  {
    // Arrange.
    Lecturer lecturer = new Lecturer("Micheal", DateTime.parse("2000-03-04"), 5);

    // Act.
    String username = lecturer.getUsername();

    // Assert.
    assertEquals("Micheal22", username);
  }

  @Test 
  void returnsCorrectAge()
  {
    // Arrange.
    Lecturer lecturer = new Lecturer("Craig", DateTime.parse("2001-06-10"), 10);

    // Act.
    int age = lecturer.getAge();

    // Assert.
    assertEquals(21, age);
  }

  @Test 
  void returnsCorrectModuleCount()
  {
    // Arrange.
    Lecturer lecturer = new Lecturer("Frank", DateTime.parse("2001-06-10"), 15);

    Module m1 = new Module("Cryptography", "CS402", lecturer);
    Module m2 = new Module("Graphics & Image Process", "CT404", lecturer);
    Module m3 = new Module("Real Time Systems", "CT420", lecturer);

    ArrayList<Module> modules = new ArrayList<>();
    modules.add(m1);
    modules.add(m2);
    modules.add(m3);

    lecturer.setModules(modules);

    // Act.
    int moduleCount = lecturer.getModules().size();

    // Assert.
    assertEquals(3, moduleCount);
  }

  @Test 
  void returnsCorrectName()
  {
    // Arrange.
    Lecturer lecturer = new Lecturer("Frank", DateTime.parse("2001-06-10"), 15);

    // Act.
    String name = lecturer.getName();

    // Assert.
    assertEquals("Frank", name);
  }

  @Test 
  void returnsCorrectDateOfBirth()
  {
    // Arrange.
    Lecturer lecturer = new Lecturer("Frank", DateTime.parse("2001-06-10"), 15);

    // Act.
    DateTime dob = lecturer.getDateOfBirth();

    // Assert.
    assertEquals(DateTime.parse("2001-06-10"), dob);
  }

  @Test 
  void returnsCorrectId()
  {
    // Arrange.
    Lecturer lecturer = new Lecturer("Frank", DateTime.parse("2001-06-10"), 15);

    // Act.
    long id = lecturer.getId();

    // Assert.
    assertEquals(15, id);
  }
}
