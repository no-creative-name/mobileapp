import java.util.ArrayList;
import java.util.List;

public class Repository {

    List<Person> persons = new ArrayList<Person>();
    List<Company> companies = new ArrayList<Company>();

    public void deleteCompany(Company toDelete, boolean deleteAllEmployees) {
        if(deleteAllEmployees) {
            List<Person> employees = toDelete.employees;
            for(int i = 0; i < persons.size(); i++) {
                for(int j = 0; j < employees.size(); j++) {
                    if(persons.get(i).id == employees.get(j).id) {
                        persons.remove(i);
                    }
                }
            }
        }
        for(int i = 0; i < companies.size(); i++) {
            if(companies.get(i).id == toDelete.id) {
                companies.remove(i);
            }
        }
    }

}
