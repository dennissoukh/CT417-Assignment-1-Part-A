import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest 
{
  @Test
  void returnsCorrectUsername()
  {
    // Arrange.
    DateTime dateOfBirth = DateTime.parse("2001-05-11");
    Student student = new Student("John", dateOfBirth, 5);

    // Act.
    String username = student.getUsername();

    // Assert.
    assertEquals("John21", username);
  }
}
