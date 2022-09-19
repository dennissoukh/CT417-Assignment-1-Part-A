import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;
import static org.junit.jupiter.api.Assertions.*;

public class LecturerTest 
{
  @Test
  void returnsCorrectUsername()
  {
    // Arrange.
    DateTime dateOfBirth = new DateTime();
    Lecturer lecturer = new Lecturer("Micheal", 25, dateOfBirth, 5);

    // Act.
    String username = lecturer.getUsername();

    // Assert.
    assertEquals("Micheal25", username);
  }
}
