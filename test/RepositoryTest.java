import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {

    @Test
    void deleteCompanyWithoutEmployees() {
        Repository repo = new Repository();

        Company c1 = new Company(0,"Test Company");
        Company c2 = new Company(1,"Test Company 2");
        Company c3 = new Company(2,"Test Company 3");

        repo.persons.add(new Person(0,"John", "Doe"));
        repo.persons.add(new Person(1,"Jane", "Doe"));
        repo.persons.add(new Person(2,"Jamie", "Doe"));

        c2.addEmployee(repo.persons.get(0));
        c2.addEmployee(repo.persons.get(1));
        c2.addEmployee(repo.persons.get(2));

        repo.companies.add(c1);
        repo.companies.add(c2);
        repo.companies.add(c3);

        repo.deleteCompany(c2, false);

        assertEquals(2, repo.companies.size());
        assertEquals(3, repo.persons.size());
    }

    @Test
    void deleteCompanyWithAllEmployees() {
        Repository repo = new Repository();

        Company c1 = new Company(0,"Test Company");
        repo.persons.add(new Person(0,"John", "Doe"));
        repo.persons.add(new Person(1,"Jane", "Doe"));
        repo.persons.add(new Person(2,"Jamie", "Doe"));
        Person anotherCompanysEmployee = new Person(3, "Jennifer", "Doe");
        repo.persons.add(anotherCompanysEmployee);

        c1.addEmployee(repo.persons.get(0));
        c1.addEmployee(repo.persons.get(1));
        c1.addEmployee(repo.persons.get(2));

        repo.companies.add(c1);

        repo.deleteCompany(c1, true);

        assertEquals(0, repo.companies.size());
        assertEquals(1, repo.persons.size());
        assertEquals(anotherCompanysEmployee.id, repo.persons.get(0).id);
    }
}