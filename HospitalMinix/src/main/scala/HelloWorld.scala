object HelloWorld{
  def main(args: Array[String]){
    println("Hello World")
    var thisint :Int = 10;
    var thisString :String = "Helau mai frend";

    println(thisint + " " + thisString)

    val pt = new Point(10, 20);
    pt.move(10,10);

    Single.printit()
    Single.printit()

    println(addition(55,4));

    var addit = (i:Int, j:Int ) => i + j;

    println(addit(10,27));
    C
  }

  def addition(x: Int, y: Int) : Int = {
    return x + y;
  }
}

class Point(val xc: Int, val yc: Int)
{
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int,  dy: Int){
    x = x + dx
    y = y + dy

    println(x)
    println(y)

    val loc = new Location(10, 20, 15);
    loc.move(10,10,5)
  }
}

class Location(override val xc: Int, override val yc: Int, val zc: Int) extends Point(xc, yc){
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int): Unit ={
    x = x + dx
    y = y + dy
    z = z + dz
    println ("Point x location : " + x);
    println ("Point y location : " + y);
    println ("Point z location : " + z);
  }
}

object Single{
  def printit(): Unit ={
    println("Hey cool at me, Iama Scala dev");
  }
}