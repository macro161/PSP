import java.util.ArrayList;
import java.util.List;

public class InsuranceCompany {
    public List<Person> clients = new ArrayList<>();
    public ITreatmentCalculator treatmentCalculator;

    public InsuranceCompany(ITreatmentCalculator treatmentCalculator)
    {
        this.treatmentCalculator = treatmentCalculator;
    }

    public void calculateInsuranceCost()
    {
        for(Person client : clients)
        {
            int insuranceCost = treatmentCalculator.CalculateMortality(client) * 50;
            System.out.println("Insurance cost for " + client.id + " = " + insuranceCost);
        }
    }
}
