import java.util.ArrayList;
import org.joda.time.DateTime;

public class Student {
  private String name;
  private int age;
  private DateTime dateOfBirth;
  private int id;
  private ArrayList<CourseProgramme> courses;
  private ArrayList<Module> modules;

  public Student(String name, int age, DateTime dateOfBirth, int id)
  {
    this.name = name;
    this.age = age;
    this.dateOfBirth = dateOfBirth;
    this.id = id;
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
    return name + String.valueOf(age);
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
}
