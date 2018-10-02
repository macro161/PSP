public class Person {
    public int id;
    public int age;
    public int healthcarePlan;
    public boolean smoking;
    public boolean drinking;
    public Doctor assignedDoctor;
    public Treatment assignedTreatment;
    public int pulse;

    public Person(int id, int age, int healthcarePlan, boolean smoking, boolean drinking, Doctor assignedDoctor, int pulse) {
        this.id = id;
        this.age = age;
        this.healthcarePlan = healthcarePlan;
        this.smoking = smoking;
        this.drinking = drinking;
        this.assignedDoctor = assignedDoctor;
        this.pulse = pulse;
        assignedTreatment = new Treatment();
    }
}
