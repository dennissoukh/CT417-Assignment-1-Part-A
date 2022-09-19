import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme {
  public String name;
  public ArrayList<Module> modules;
  public ArrayList<Student> students;
  public DateTime startDate, endDate;

  public CourseProgramme(String name, ArrayList<Module> modules, ArrayList<Student> students, DateTime startDate, DateTime endDate)
  {
    this.name = name;
    this.modules = modules;
    this.students = students;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public String getName()
  {
    return name;
  }

  public ArrayList<Module> getModules()
  {
    return modules;
  }

  public ArrayList<Student> getStudents()
  {
    return students;
  }

  public DateTime getStartDate()
  {
    return startDate;
  }

  public DateTime getEndDate()
  {
    return endDate;
  }
}
