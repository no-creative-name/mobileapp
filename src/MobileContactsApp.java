import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MobileContactsApp {

    public static List<Company> sortCompanies(List<Company> listOfCompanies) {
        Collections.sort(listOfCompanies, new Comparator<Company>() {
            @Override
            public int compare(Company c1, Company c2) {
                return c1.name.compareTo(c2.name);
            }
        });
        return listOfCompanies;
    }

    public static void main (String [] args) {

    }
}
