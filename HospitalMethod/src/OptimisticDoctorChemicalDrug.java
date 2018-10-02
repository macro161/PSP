import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class OptimisticDoctorChemicalDrug extends DoctorChemicalDrug {


    public OptimisticDoctorChemicalDrug(List<Person> patients) {
        this.patients = patients;
    }

    void PrescribeChemicalDrugs(Person patient) {
        System.out.println("Drugs prescribed to " + patient.id + " in " + this.getClass());
        patient.treatment.drugs.add("Xanax");
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
