import java.util.ArrayList;
import java.util.List;

public class InsuranceCompany {
    public List<Person> clients = new ArrayList<Person>();
    public DoctorChemicalDrug consultant = new PesimisticDoctorChemicalDrug();

    public InsuranceCompany(List<Person> clients, DoctorChemicalDrug consultant) {
        this.clients = clients;
        this.consultant = consultant;
    }

    public void calculateInsurancePrice()
    {
        for(Person client : clients)
        {
            System.out.println("Client " + client.id + " insurance price is  " + (consultant.MortalityCalculator(client) * 8));
        }
    }
}
