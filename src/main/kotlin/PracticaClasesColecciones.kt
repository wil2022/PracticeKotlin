//Tarea 1
data class Event(
    val title : String,
    val description : String? = null,
    val daypart : Daypart,
    val durationInMinutes : Int
)

enum class Daypart {
    MORNING, AFTERNOON, EVENING
}

val Event.durationOfEvent : String
    get() = if(durationInMinutes < 60) "short" else "long"


fun main(){

    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

    val events = mutableListOf(event1, event2, event3, event4, event5, event6)

    println(events.size)

    val shortEvents = events.filter {
        it.durationInMinutes < 60
    }

    println("You have ${shortEvents.size} short events.")


    val groupedEvents = events.groupBy { it.daypart }

    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }

    println("Last event of the day: ${events.last().title}")

    println("Duration of first event of the day: ${events[0].durationOfEvent}")


/*
    val eventsMorning = groupedEvents[Daypart.MORNING] ?: listOf()
    val eventsAfternoon = groupedEvents[Daypart.AFTERNOON] ?: listOf()
    val eventsEvening = groupedEvents[Daypart.EVENING] ?: listOf()


    println("Morning: ${eventsMorning.size} events")
    println("Afternoon: ${eventsAfternoon.size} events")
    println("Evening: ${eventsEvening.size} events")

 */


/*
    val event = Event(title = "Study Kotlin", description = "Commit to studying Kotlin at least 15 minutes per day.",
                        daypart = Daypart.EVENING, durationInMinutes = 15)

    println("Event(title=${event.title}, description=${event.description}, daypart=${event.daypart}, " +
            "durationInMinutes=${event.durationInMinutes})")

    //Event(title=Study Kotlin, description=Commit to studying Kotlin at least 15 minutes per day., daypart=Evening, durationInMinutes=15)
 */
}
