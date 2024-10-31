package com.example.myapplication

import com.example.myapplication.nhiemvu4.Daypart3
import com.example.myapplication.nhiemvu4.Event3

class nhiemvu5 {
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
fun main() {
    val event0 = Event3("many", "Learn at G2", Daypart3.EVENING, 12)
    val event1 = Event3(
        title = "Wake up",
        description = "Time to get up",
        daypart = Daypart3.MORNING,
        durationInMinutes = 0
    )
    val event2 = Event3(title = "Eat breakfast", daypart = Daypart3.MORNING, durationInMinutes = 15)
    val event3 =
        Event3(title = "Learn about Kotlin", daypart = Daypart3.AFTERNOON, durationInMinutes = 30)
    val event4 =
        Event3(title = "Practice Compose", daypart = Daypart3.AFTERNOON, durationInMinutes = 60)
    val event5 = Event3(
        title = "Watch latest DevBytes video",
        daypart = Daypart3.AFTERNOON,
        durationInMinutes = 80
    )
    val event6 = Event3(
        title = "Check out latest Android Jetpack library",
        daypart = Daypart3.EVENING,
        durationInMinutes = 45
    )

    val events = mutableListOf<Event3>(event0, event1, event2, event3, event4, event5, event6)
    println("data : \n$events\n")

    val groupedEvents = events.groupBy { it.daypart }
    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }
}