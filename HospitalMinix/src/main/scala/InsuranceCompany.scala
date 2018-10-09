class InsuranceCompany(clientc : List[Person]) {
  val clients: List[Person] =  clientc
  val consultant: Consultant = new Consultant();

  def getAllInsurancePrices(): Unit =
  {
    for(client <- clients){
      consultant.calculateInsurancePrice(client)
    }
  }

}
