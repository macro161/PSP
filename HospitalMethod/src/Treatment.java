import java.util.ArrayList;
import java.util.List;

public class Treatment {
    public List<String> drugs = new ArrayList<String>();
    public String treatmentPlan;

    public Treatment(String treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }
}
