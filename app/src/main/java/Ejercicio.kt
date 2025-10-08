package com.example.ejercicioskotlin
fun main(){
    var a: Int? = 5//cuando añadimos ? es para evitar que nos de null cuando se pone letra ne vez de numero

    println("La variable a es  " + a)
    println("La variable a es  $a") //plantilla
    a = 9
    println("La variable a es  " +a)
   // a = readln().toInt()
    a = readln().toIntOrNull()
    println("La variable a es  $a")//para modificar la nueva salida, al introducir un numero

/*
la parte del if

    if(a!= null) println("la variable a es $a")
    else println("LA VARIABLE A NO ES UN ENTERO")
    */

    //WHEN
    a = readln().toIntOrNull()
    when(a){
        //hay que hacerlo con orden, nada despues del else
        1 -> print("la variable a es uhn triste 1")
        2,3,4 -> println("la variable a esta entre 2 y 4")
        //se puede poner entre rangos
        in 5..10 -> println(" la variable a esta mas alla del 5 y menos que 11")

        //forma de decir que es nulo de int
        !is Int -> print("la variable a eno es un nuelo")
        else -> println("caso raro")



    }
    println(pedirHora())
pedirHora()
}
//FUNCIONES fuera
//fun pedirHora(): String
//fun pedirHora(): unit es nada  : unit
fun pedirHora(): String{
    println("introduce la hora actual entre 0 y 23")
    var hora: Int? =readln().toIntOrNull()
    when(hora){
        in 0..6 -> return ("buenas noches")
        in 7..12 -> return ("buenas dias")
        in 13..20 -> return ("buenas tardes")
        in 20..23 -> return ("A dormir")
        else -> return ("valor intrpducido no es correcto")
    }
}