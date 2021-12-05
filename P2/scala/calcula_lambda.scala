object calculadora_lambda {

  def main(args: Array[String]): Unit ={
		println("ingrese dos numeros:")
		val a = scala.io.StdIn.readInt()
		val b = scala.io.StdIn.readInt()
		
		val suma: (Int, Int) => Int = (x: Int, y: Int) => {x + y}
		val resta: (Int, Int) => Int = (x: Int, y: Int) => {x - y}
		val multiplicacion: (Int, Int) => Int = (x: Int, y: Int) => {x * y}
		val division: (Int, Int) => Int = (x: Int, y: Int) => {x / y}
		println("la suma: "+ suma(a,b))
		println("la resta: "+ resta(a,b))
		println("la multiplicacion: "+ multiplicacion(a,b))		
		println("la division: "+ division(a,b))
		
	}
}