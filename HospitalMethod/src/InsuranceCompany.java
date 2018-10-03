import java.util.ArrayList;
import java.util.List;

public class InsuranceCompany {
    public List<Person> clients;
    public DoctorChemicalDrug consultant = new PesimisticDoctorChemicalDrug();

    public InsuranceCompany(List<Person> clients) {
        this.clients = clients;
    }

    public void calculateInsurancePrice()
    {
        for(Person client : clients)
        {
            System.out.println("Client " + client.id + " insurance price is  " + (consultant.calculateMortality(client) * 8));
        }
    }
}
