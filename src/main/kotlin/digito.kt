class digito {
    var val1: Int=0
    var val2: Int=0
    var val3: Int=0
    var mayor: Int=0
    var menor: Int=0
    var sumar: Int=0
    var restar: Int=0

    fun solicitud(){
        print("Ingrese el primer valor")
        val1 = readLine()!!.toInt()
        print("Ingrese el segundo valor")
        val2 = readLine()!!.toInt()
        print("Ingrese el tercer valor")
        val3 = readLine()!!.toInt()
    }

    fun diferente(){
        //Asegurarnos que los valores sean diferentes

        if (val1 == val2 && val1 == val3 && val2 == val3)
            print("Los valores tienen que ser distintos, por favor")
    }

    fun multi5(){
        if(val1 %5 !=0 && val2 %5 !=0 && val3 %5 !=0)
            print("Los numeros ingresados, deben ser multiplos de 5")
    }

    fun mayormenorque(){
        mayor = if (val1 > val2 && val1 > val3) val1 else if (val2 > val3) val2 else val3
        menor = if (val1 < val2 && val1 < val3) val1 else if (val2 < val3) val2 else val3
    }

    fun mayormenor(){
        if(menor > 10)
            sumar=mayor+10
        else if(mayor < 50)
            restar=menor-5
    }

    fun impresion(){
        println("los valores ingresados son $val1, $val2, $val3")
        print("*********************************************")
        print("El valor mayor es $mayor y el valor menor es $menor de los valores")
        print("**********************************************")
        print("Debido a que el valor menor es mayor a 10 nuestro valor mayor se suma 10 teniendo como resultado $sumar")
        print("**********************************************")
        print("Debido a que el valor mayor es menor a 50, el valor menor se le resta 5 teniendo como resultado $restar")
    }
}