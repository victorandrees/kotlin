package org.example
fun main() {
    println("ingrese su edad")
    var edad = readLine()!!.toInt()
    if (edad <= 18 || edad > 23){
        println("no puedes acceder al when por su edad de $edad años")
    }
    else{
        println("si puedes acceder al when")
        println("ingrese el num1")
        var num1= readLine()!!.toInt()
        println("ingrese el num2")
        var num2= readLine()!!.toInt()
        when(edad){


            19-> println("Suma ${num1+num2}")
            20-> println("Resta ${num1-num2}")
            21-> println("Multipli ${num1*num2}")
            22-> println("Divi ${num1/num2}")
            23-> println(num1*num2/2)
        }
    }


}

