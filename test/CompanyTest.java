import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void addEmployee() {
        Company testCompany = new Company(0, "Test Company");
        Person testPerson = new Person(0, "John", "Doe");

        testCompany.addEmployee(testPerson);

        assertEquals(testPerson.id, testCompany.employees.get(0).id);
    }
}