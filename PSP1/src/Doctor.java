import java.util.ArrayList;
import java.util.List;

public class Doctor {
    public List<Person> patients = new ArrayList<>();
    public ITreatmentCalculator treatmentCalculator;
    public IDrugPolicy drugPolicy;

    public Doctor(ITreatmentCalculator treatmentCalculator, IDrugPolicy drugPolicy)
    {
        this.treatmentCalculator = treatmentCalculator;
        this.drugPolicy = drugPolicy;
    }

    public void TreatPatients()
    {
        for(Person patient : patients)
        {
            treatmentCalculator.AssignTreatmentPlan(patient);
            treatmentCalculator.CalculateMortality(patient);
            drugPolicy.prescribeDrug(patient);
        }
    }


}
