package com.example.myapplication

class nhiemvu2{
    enum class Daypart2 {
        MORNING,
        AFTERNOON,
        EVENING,
    }

    data class Event2(
        val title: String,
        val description: String? = null,
        val daypart: Daypart2,
        val durationInMinutes: Int,
    )

}

fun main(){
    val event2 = nhiemvu2.Event2(
        "many", "T di hoc", nhiemvu2.Daypart2.EVENING, 12
    )
    println("data : $event2")
}



