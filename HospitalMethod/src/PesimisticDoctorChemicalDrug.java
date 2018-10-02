import java.util.ArrayList;
import java.util.List;

public class PesimisticDoctorChemicalDrug extends DoctorChemicalDrug {

    public PesimisticDoctorChemicalDrug(List<Person> patients) {
        this.patients = patients;
    }

    public PesimisticDoctorChemicalDrug() {

    }

    @Override
    void PrescribeChemicalDrugs(Person patient) {
        System.out.println("Drugs prescribed to " + patient.id + " in " + this.getClass());
        patient.treatment.drugs.add("Antibiotics");
    }

    @Override
    void AssignTreatmentPlan(Person patient) {
        System.out.println("Treatment assigned to " + patient.id + " in " + this.getClass());
        patient.treatment.treatmentPlan +="Hospitalisation";
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
