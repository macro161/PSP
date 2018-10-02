import java.util.ArrayList;
import java.util.List;

public class OptimisticDoctorNaturalDrug extends DoctorNaturalDrug {

    public OptimisticDoctorNaturalDrug(List<Person> patients) {
        this.patients = patients;
    }
    void PrescribeNaturalDrugs(Person patient) {
        System.out.println("Drugs prescribed to " + patient.id + " in " + this.getClass());
        patient.treatment.drugs.add("Herbal extract");
    }

    @Override
    void AssignTreatmentPlan(Person patient) {
        System.out.println("Treatment assigned to " + patient.id + " in " + this.getClass());
        patient.treatment.treatmentPlan += "Just chill out";
    }

    @Override
    int MortalityCalculator(Person patient) {
        System.out.println("Mortality evaluated to " + patient.id + " in" + this.getClass());
        return patient.age + patient.pulse;
    }
}
