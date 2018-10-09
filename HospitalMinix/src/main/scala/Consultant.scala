class Consultant extends GeneralDoctorTrait with CardiologistTrait {
  def calculateInsurancePrice(person: Person) : Int = {
    var price = 0
    price += calculateHeartDiseaseRisk(person) * 15
    price += calculateMortality(person) + 150

    println(this.getClass + " price for " + person.id + " is " + price)

    return price;
  }
}
