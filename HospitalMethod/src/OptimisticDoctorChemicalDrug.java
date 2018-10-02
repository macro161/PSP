import java.lang.reflect.Array;
import java.util.ArrayList;

public class OptimisticDoctorChemicalDrug extends DoctorChemicalDrug {


    public OptimisticDoctorChemicalDrug(ArrayList<Person> patients) {
        this.patients = patients;
    }

    @Override
    void PrescribeChemicalDrugs(Person patient) {
        System.out.println("Drugs prescribed to " + patient.id + " in " + this.getClass());
    }

    @Override
    void AssignTreatmentPlan(Person patient) {
        System.out.println("Treatment assigned to " + patient.id + " in " + this.getClass());
    }

    @Override
    int MortalityCalculator(Person patient) {
        System.out.println("Mortality evaluated to " + patient.id + " in" + this.getClass());
        return 0;
    }
}
