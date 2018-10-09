trait GeneralDoctorTrait extends DoctorTrait {
  def prescribeDrugs(person: Person): Unit ={
    if(person.drinking || person.smoking)
      {
        person.treatment.drugs +: "Anti-addiction drugs"
      }
    else {person.treatment.drugs +: "Some kind of weird experimental drugs"}
  }

  def calculateMortality(person: Person): Int = {
    var mortality: Int = 0

    if(person.bmi > 25 ){mortality += 10}
    if(person.smoking || person.drinking) {mortality += 15}
    mortality += person.age;

    println(this.getClass + " mortality for " + person.id + " is " + mortality)
    return mortality
  }
}
