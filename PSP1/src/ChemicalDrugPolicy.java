public class ChemicalDrugPolicy implements IDrugPolicy {
    @Override
    public void prescribeDrug(Person person) {
        System.out.println("Using: "+this.getClass() + "For drug prescribtion");
        if(!person.drinking)
        {
            System.out.println("Antibiotics assigned  for treatment to person " + person.id);
        }

    }

    public void CheckAlergies (Person person){
        System.out.println("Using " + this.getClass() + " To check allergies");
    }
}
