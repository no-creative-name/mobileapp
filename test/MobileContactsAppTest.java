import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MobileContactsAppTest {

    @Test
    void sortCompanies() {
        Company c1 = new Company(0,"A Test Company");
        Company c2 = new Company(1, "B Test Company");
        Company c3 = new Company(2,"C Test Company");
        Company c4 = new Company(3,"D Test Company");
        Company c5 = new Company(4,"E Test Company");

        List<Company> companies = new ArrayList<Company>();

        companies.add(c5);
        companies.add(c2);
        companies.add(c4);
        companies.add(c1);
        companies.add(c3);

        companies = MobileContactsApp.sortCompanies(companies);

        assertEquals(c1.name, companies.get(0).name);
        assertEquals(c2.name, companies.get(1).name);
        assertEquals(c3.name, companies.get(2).name);
        assertEquals(c4.name, companies.get(3).name);
        assertEquals(c5.name, companies.get(4).name);
    }
}