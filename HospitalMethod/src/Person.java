import java.util.Date;

public class Person {
    public int id;
    public int HealthcarePlan;
    public boolean smoking;
    public boolean drinking;
    public int pulse;
    public int age;
    public Treatment treatment = new Treatment("");

    public Person(int id, int healthcarePlan, boolean smoking, boolean drinking, int pulse, int age) {
        this.id = id;
        HealthcarePlan = healthcarePlan;
        this.smoking = smoking;
        this.drinking = drinking;
        this.pulse = pulse;
        this.age = age;
    }
}
