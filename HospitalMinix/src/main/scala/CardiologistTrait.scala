trait CardiologistTrait extends DoctorTrait  {
  def calculateHeartDiseaseRisk(person: Person) : Int ={
    var risk : Int = 0
      if(person.bmi > 25) {risk += 20}
      if(person.smoking) {risk +=50}
    println(this.getClass + " risk for " + person.id + " is " + risk)
    return risk
  }
}
