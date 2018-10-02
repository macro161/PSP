import java.util.ArrayList;
import java.util.List;

public class PesimisticDoctorNaturalDrug extends DoctorNaturalDrug {

    public PesimisticDoctorNaturalDrug(List<Person> patients) {
        this.patients = patients;
    }

    @Override
    void PrescribeNaturalDrugs(Person patient) {
        System.out.println("Drugs prescribed to " + patient.id + " in " + this.getClass());
        patient.treatment.drugs.add("Herbal extract");
    }

    @Override
    void AssignTreatmentPlan(Person patient) {
        System.out.println("Treatment assigned to " + patient.id + " in " + this.getClass());
        patient.treatment.treatmentPlan += "Hospitalisation";
    }

    @Override
    int MortalityCalculator(Person patient) {
        System.out.println("Mortality evaluated to " + patient.id + " in" + this.getClass());
        int mortality = 0;

        mortality += patient.age + patient.pulse;

        if(patient.drinking) mortality += 10;
        if(patient.smoking) mortality += 5;
        return mortality;
    }
}
