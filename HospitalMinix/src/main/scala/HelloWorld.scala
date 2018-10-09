object HelloWorld{
  def main(args: Array[String]){

    val personOne: Person = new Person(1111, 25.1, 26, true, false);
    val personTwo: Person = new Person(2222, 22,30,false, true);
    val personThree: Person = new Person(3333, 30, 45, true, true);
    val personFour: Person = new Person(4444, 20, 56, false, false );

    val company: InsuranceCompany = new InsuranceCompany(List(personOne,personTwo,personThree,personFour));

    company.getAllInsurancePrices();
  }
}
