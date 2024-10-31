package com.example.myapplication

class nhiemvu3{
    enum class Daypart3 {
        MORNING,
        AFTERNOON,
        EVENING,
    }

    data class Event3(
        val title: String,
        val description: String? = null,
        val daypart: Daypart3,
        val durationInMinutes: Int,
    )
}
fun main(){
    val event0 = nhiemvu3.Event3("many", "Learn at G2", nhiemvu3.Daypart3.EVENING, 12)
    val event1 = nhiemvu3.Event3(title = "Wake up", description = "Time to get up", daypart = nhiemvu3.Daypart3.MORNING, durationInMinutes = 0)
    val event2 = nhiemvu3.Event3(title = "Eat breakfast", daypart = nhiemvu3.Daypart3.MORNING, durationInMinutes = 15)
    val event3 = nhiemvu3.Event3(title = "Learn about Kotlin", daypart = nhiemvu3.Daypart3.AFTERNOON, durationInMinutes = 30)
    val event4 = nhiemvu3.Event3(title = "Practice Compose", daypart = nhiemvu3.Daypart3.AFTERNOON, durationInMinutes = 60)
    val event5 = nhiemvu3.Event3(title = "Watch latest DevBytes video", daypart = nhiemvu3.Daypart3.AFTERNOON, durationInMinutes = 10)
    val event6 = nhiemvu3.Event3(title = "Check out latest Android Jetpack library", daypart = nhiemvu3.Daypart3.EVENING, durationInMinutes = 45)

    val events = mutableListOf<nhiemvu3.Event3>(event0,event1, event2, event3, event4, event5, event6)
    println("data : \n$events\n")
}



