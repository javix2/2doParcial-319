case object DivisionPorCero

object Calculadora {

  def suma(x: Int, y: Int) = {
    x + y
  }
  def resta(x: Int, y: Int) = {
    x - y
  }
  def multiplicacion(x: Int, y: Int) = {
    x * y
  }
  def division(x: Int, y: Int) = {
    y match {
      case 0 => DivisionPorCero
      case _ => (x:Float)/y
    }
  }

  def main(args: Array[String]): Unit ={
		println("ingrese dos numeros:")
		val a = scala.io.StdIn.readInt()
		val b = scala.io.StdIn.readInt()
		
		println("la suma es: "+ suma(a,b));
		println("la resta es: "+resta(a,b));
		println("la multiplicacion es: "+multiplicacion(a,b));
		println("la division es: "+division(a,b));
		
	}
}


	
