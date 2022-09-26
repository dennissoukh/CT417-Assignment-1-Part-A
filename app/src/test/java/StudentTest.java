import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest 
{
  @Test
  void returnsCorrectUsername()
  {
    // Arrange.
    DateTime dateOfBirth = new DateTime();
    Student student = new Student("John", dateOfBirth, 5);

    // Act.
    String username = student.getUsername();

    // Assert.
    assertEquals("John53", username);
  }
}
