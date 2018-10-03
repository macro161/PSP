import java.util.ArrayList;
import java.util.List;

public class DoctorChemicalDrug extends Doctor {

    List<Person> patients = new ArrayList<Person>();

    @Override
    public void prescribeDrugs(Person patient)
    {
        System.out.println(this.getClass() + " Prescribes drugs to " + patient.id);
        if(patient.smoking && patient.drinking)
        {
            patient.treatment.drugs.add("Anti adiction pills with heroin");
        }else{
            patient.treatment.drugs.add("Heroin");
        }
    }

    @Override
    public void assignTreatmentPlan(Person patient)
    {
        System.out.println(this.getClass() + " Assigns treatement to " + patient.id);
        if(patient.pulse >= 100)
        {
            patient.treatment.treatmentPlan += " Hospitalisation and relaxation treatment";
        }else{
            patient.treatment.treatmentPlan += " No health issues, just take care";
        }
    }
}
