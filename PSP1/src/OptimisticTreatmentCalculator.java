public class OptimisticTreatmentCalculator implements ITreatmentCalculator {
    @Override
    public int CalculateMortality(Person person) {
        System.out.println("Using: " + this.getClass() + " to calculate mortality");
        int mortality = person.age + (person.pulse / 10);

        return mortality;
    }

    @Override
    public void AssignTreatmentPlan(Person person) {
        System.out.println("Using" + this.getClass() + " assign treatment plan to person " + person.id);

        if(person.pulse > 100 && person.smoking)
        {
            System.out.println("Patient in bad condition");
            person.assignedTreatment.medicalRecord = " Patient is in very bad condition";
        }else{
            person.assignedTreatment.medicalRecord = " Patient is in healthy condition";
            System.out.println("Patient in good condition");
        }
    }
}
