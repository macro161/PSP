import java.util.ArrayList;
import java.util.List;

public abstract class Doctor {
    List<Person> patients = new ArrayList<Person>();

    void prescribeDrugs(Person patient){
        patient.treatment.drugs.add("Random bottle from the shelf");
        System.out.println(this.getClass() + "Random bottle from the shelf to : " + patient.id);
    };
    int calculateMortality(Person patient){
        System.out.println(this.getClass() + "says that we all gonna die one day");
        return 100;
    }
    void assignTreatmentPlan(Person patient){
        System.out.println(this.getClass() + "says that time cures everything");
        patient.treatment.treatmentPlan += "Just take your time";
    }

    void TreatPatients()
    {
        for(Person patient : patients)
        {
            prescribeDrugs(patient);
            calculateMortality(patient);
            assignTreatmentPlan(patient);
        }
    }
}
