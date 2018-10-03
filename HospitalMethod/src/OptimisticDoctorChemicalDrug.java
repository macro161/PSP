import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class OptimisticDoctorChemicalDrug extends DoctorChemicalDrug {

    public OptimisticDoctorChemicalDrug(List<Person> patients)
    {
        this.patients = patients;
    }

    @Override
    public int calculateMortality(Person patient)
    {
        System.out.println(this.getClass() + " Evaluates mortality to " + patient.id);

        int mortality = 0;

        if(patient.pulse > 120)  mortality += 25;
        else mortality += 10;


        return mortality;
    }


}
