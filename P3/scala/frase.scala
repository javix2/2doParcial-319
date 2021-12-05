object Frase {

    def main(args:Array[String]): Unit =
    { 
		//val cadena = scala.io.StdIn.readLine()
		val cadena = "esto es un ejemplo en scala"
		var lis1: List[String] = List()
		var lis2: List[Char] = List()
		val res = cadena.split(" ")
		println(cadena)

		for(i <-res) 
        { 
			lis1 = i:: lis1  			
        } 
		println(lis1.reverse)

		for(i<-cadena) 
        { 
			if (i !=' ') lis2 = i::lis2 			
        } 
		println(lis2.reverse)
		
    } 
}