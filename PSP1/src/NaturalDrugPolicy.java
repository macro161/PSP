public class NaturalDrugPolicy implements  IDrugPolicy {
    @Override
    public void prescribeDrug(Person person) {
        System.out.println("Using: "+this.getClass() + " For drug prescription");

        if(person.pulse > 90)
        {
            System.out.println("Herbal extract assigned  for treatment to person " + person.id);
            person.assignedTreatment.assignedDrugs.add("Herbal extract");
        }else{
            System.out.println("Green tea assigned  for treatment to person " + person.id);
            person.assignedTreatment.assignedDrugs.add("Green tea");
        }
    }

    public void searchHerbs(Person person)
    {
        System.out.println("Using: " + this.getClass() + " To search herbs");
    }
}
