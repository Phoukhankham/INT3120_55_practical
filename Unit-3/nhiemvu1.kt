package com.example.myapplication

class nhiemvu1{
     data class Event1(
          val title: String,
          val description: String? = null,
          val daypart: String,
          val durationInMinutes: Int,
     )

}
fun main(){
     val event = nhiemvu1.Event1("many", "T di hoc", "11b", 12)
     println(event)
}

