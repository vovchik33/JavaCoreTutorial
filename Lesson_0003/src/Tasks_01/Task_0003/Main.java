package Tasks_01.Task_0003;

import Tasks_01.Task_0003.employers.Employer;
import Tasks_01.Task_0003.employers.Fireman;
import Tasks_01.Task_0003.employers.Nurse;
import Tasks_01.Task_0003.employers.Policeman;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladimirkr on 11/25/2014.
 */
public class Main {
    public static void main(String[] args) {
        List<Employer> employers = new ArrayList<Employer>();

        employers.add(new Policeman());
        employers.add(new Fireman());
        employers.add(new Nurse());

        for (Employer employer:employers) {
            System.out.println(employer.toString());
        }
    }
}
