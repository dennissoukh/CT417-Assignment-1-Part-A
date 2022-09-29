import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;
import static org.junit.jupiter.api.Assertions.*;

public class LecturerTest 
{
  @Test
  void returnsCorrectUsername()
  {
    // Arrange.
    DateTime dateOfBirth = DateTime.parse("2000-03-04");
    Lecturer lecturer = new Lecturer("Micheal", dateOfBirth, 5);

    // Act.
    String username = lecturer.getUsername();

    // Assert.
    assertEquals("Micheal22", username);
  }

  @Test 
  void returnsCorrectAge()
  {
    // Arrange.
    DateTime dateOfBirth = DateTime.parse("2001-06-10");
    Lecturer lecturer = new Lecturer("Craig", dateOfBirth, 10);

    // Act.
    int age = lecturer.getAge();

    // Assert.
    assertEquals(21, age);
  }
}
