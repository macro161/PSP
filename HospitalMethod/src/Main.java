import java.util.Arrays;

public class Main {
    public static void main(String [ ] args)
    {
        System.out.print("hello world");

        Person personOne = new Person(0000, 80, true, true, 140, 30  );
        Person personTwo = new Person(1111, 25, true, false, 80, 15  );
        Person personThree = new Person(2222, 45, true, true, 190, 45  );
        Person personFour = new Person(3333, 10, true, false, 80, 80  );
        Person personFive = new Person(4444, 16, true, true, 70, 27  );
        Person personSix = new Person(5555, 99, false, false, 100, 16  );
        Person personSeven = new Person(6666, 100, false, true, 110, 74  );
        Person personEight = new Person(7777, 55, false, false, 120, 36  );
        Person personNine = new Person(8888, 96, false, true, 70, 22  );
        Person personTen = new Person(9999, 5, false, false, 90, 65  );

        DoctorChemicalDrug doctorOne = new OptimisticDoctorChemicalDrug(Arrays.asList(personOne,personTwo));
        DoctorChemicalDrug doctorTwo= new PesimisticDoctorChemicalDrug(Arrays.asList(personThree, personFour, personTen));
        DoctorNaturalDrug doctorThree = new OptimisticDoctorNaturalDrug(Arrays.asList(personFive,personSix, personNine));
        DoctorNaturalDrug doctorFour = new PesimisticDoctorNaturalDrug(Arrays.asList(personSeven,personEight));

        InsuranceCompany insuranceCompany = new InsuranceCompany(Arrays.asList(personOne,personTwo,personThree,personFive,personSix,personSeven,personEight,personNine,personTen));

        doctorOne.TreatPatients();
        doctorTwo.TreatPatients();
        doctorThree.TreatPatients();
        doctorFour.TreatPatients();

        insuranceCompany.calculateInsurancePrice();
    }
}
