import java.util.ArrayList;
import java.util.List;

public class OptimisticDoctorNaturalDrug extends DoctorNaturalDrug {

    public OptimisticDoctorNaturalDrug(List<Person> patients)
    {
        this.patients = patients;
    }

    @Override
    public int calculateMortality(Person patient)
    {
        System.out.println(this.getClass() + " Evaluates mortality to " + patient.id);

        int mortality = 0;

        if(patient.pulse > 120)  mortality += 25;

        return mortality;
    }
}
