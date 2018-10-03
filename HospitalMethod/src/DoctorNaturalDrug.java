import java.util.ArrayList;
import java.util.List;

public class DoctorNaturalDrug extends Doctor {

    List<Person> patients = new ArrayList<Person>();

    @Override
    public void prescribeDrugs(Person patient)
    {
        System.out.println(this.getClass() + " Prescribes drugs to " + patient.id);
        if(patient.smoking || patient.drinking)
        {
            patient.treatment.drugs.add("Herbal antiadiction concentrate");
        }else{
            patient.treatment.drugs.add("Catnip");
        }
    }

    @Override
    public void assignTreatmentPlan(Person patient)
    {
        System.out.println(this.getClass() + " Assigns treatement to " + patient.id);
        if(patient.pulse > 110)
        {
            patient.treatment.treatmentPlan += " Just relax and listen to some music";
        }else{
            patient.treatment.treatmentPlan += " No need to worry about your health";
        }
    }
}
