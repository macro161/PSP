import java.util.Arrays;

public class Main {
    public static void main(String [ ] args)
    {
        Doctor doctorOne = new Doctor(new OptimisticTreatmentCalculator(),new NaturalDrugPolicy());
        Doctor doctorTwo = new Doctor(new PesimisticTreatmentCalculator(), new ChemicalDrugPolicy());
        InsuranceCompany insuranceCompany = new InsuranceCompany(new PesimisticTreatmentCalculator());

        Person personOne = new Person(1111, 20, 70, true, false, doctorOne,  90);
        Person personTwo = new Person(2222, 45, 90, true, true, doctorOne,  120);
        Person personThree = new Person(3333, 16, 50, false, false, doctorOne,  80);
        Person personFour = new Person(4444, 25, 10, true, true, doctorTwo,  150);
        Person personFive = new Person(5555, 55, 90, false, false, doctorTwo, 70);
        Person personSix = new Person(6666, 80, 100, true, false, doctorTwo,  100);

        doctorOne.patients.addAll(Arrays.asList(personOne,personTwo,personThree));
        doctorTwo.patients.addAll(Arrays.asList(personFour,personFive,personSix));

        insuranceCompany.clients.addAll(Arrays.asList(personOne,personTwo,personThree,personFour,personFive,personSix));

        doctorOne.TreatPatients();
        doctorTwo.TreatPatients();

        insuranceCompany.calculateInsuranceCost();
    }
}
