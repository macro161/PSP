import java.util.ArrayList;
import java.util.List;

public class PesimisticDoctorChemicalDrug extends DoctorChemicalDrug {

    public PesimisticDoctorChemicalDrug(List<Person> patients)
    {
        this.patients = patients;
    }

    public PesimisticDoctorChemicalDrug() {

    }

    @Override
    public int calculateMortality(Person patient)
    {
        System.out.println(this.getClass() + " Evaluates mortality to " + patient.id);

        int mortality = 0;

        if(patient.pulse > 120)  mortality += 25;
        if(patient.smoking) mortality += 10;
        if(patient.drinking) mortality += 5;
        mortality += patient.age;

        return mortality;
    }
}
