import java.util.ArrayList;
import java.util.List;

public abstract class DoctorChemicalDrug {
    abstract void PrescribeChemicalDrugs(Person patient);
    abstract void AssignTreatmentPlan(Person patient);
    abstract int MortalityCalculator(Person person);

    public List<Person> patients = new ArrayList<Person>();

    public void TreatPatients()
    {
        for(Person patient : patients)
        {
            PrescribeChemicalDrugs(patient);
            AssignTreatmentPlan(patient);
        }
    }
}
