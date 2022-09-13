package com.example.funcionesyclases

class Estudiantes ( val nombre:String,var edad:Int, val lenguajes:Array<lengua>,val amigo:Array<Estudiantes>?=null) {
    enum class  lengua{
        Kotlin,
        php,
        java,
        javaScript,
        python,
    }



 fun codigo(){
   for (lenguajes:lengua in lenguajes){
       println("los lenguajes de programacion que conoces son $lenguajes")
   }
 }


}