import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;

public class Student {
  private String name;
  private int age;
  private DateTime dateOfBirth;
  private int id;
  private ArrayList<CourseProgramme> courses;
  private ArrayList<Module> modules;

  public Student(String name, DateTime dateOfBirth, int id)
  {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.id = id;

    age = new Period(dateOfBirth, DateTime.now(), PeriodType.yearMonthDay()).getYears();
    courses = new ArrayList<CourseProgramme>();
    modules = new ArrayList<Module>();
  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public DateTime getDateOfBirth()
  {
    return dateOfBirth;
  }

  public int getId()
  {
    return id;
  }

  public String getUsername()
  {
    return (name + String.valueOf(age)).replaceAll("\\s", "");
  }

  public ArrayList<CourseProgramme> getCourses()
  {
    return courses;
  }

  public ArrayList<Module> getModules()
  {
    return modules;
  }

  public void setName(String name) {
    this.name = name;
  } 

  public void setAge(int age) {
    this.age = age;
  }

  public void setDateOfBirth(DateTime dateOfBirth)
  {
    this.dateOfBirth = dateOfBirth;
  }

  public void setId(int id) 
  {
    this.id = id;
  }

  public void setCourses(ArrayList<CourseProgramme> courseProgrammes)
  {
    this.courses = courseProgrammes;
  }

  public void setModules(ArrayList<Module> modules)
  {
    this.modules = modules;
  }

  public void addCourse(CourseProgramme courseProgramme)
  {
    courses.add(courseProgramme);
  }

  public void addModule(Module module)
  {
    modules.add(module);
  }

  @Override
  public String toString()
  {
    StringBuilder courseStr = new StringBuilder();

    if (courses.size() > 0) 
    {
      for (CourseProgramme c : courses)
      {
        courseStr.append("  " + c.getName() + "\n");
      }
    }

    StringBuilder moduleStr = new StringBuilder();

    if (modules.size() > 0)
    {
      for (Module m : modules)
      {
        moduleStr.append("  " + m.getId() + " - " + m.getName() + "\n");
      }
    }

    return
      "Student: " + name + "\n" +
      "- ID: " + String.valueOf(id) + "\n" +
      "- Username: " + getUsername() + "\n" +
      "- Date of Birth: " + dateOfBirth.toLocalDate() + "\n" +
      "- Age: " + String.valueOf(age) + "\n" +
      "- Courses:\n" + courseStr +
      "- Modules:\n" + moduleStr;
  }
}
