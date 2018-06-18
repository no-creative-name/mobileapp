import java.util.ArrayList;
import java.util.List;

public class Company {

    public int id;
    public String name;
    public List<Person> employees = new ArrayList<Person>();

    public Company (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addEmployee(Person employee) {
        this.employees.add(employee);
    }

}
