/*
fun main(){
     println("Hello World!")
     println("hola que hacen")
     addOne(20)
 }
*/

 fun addOne(number: Int){
     println(number+1)
 }

 fun main() {
     val unreadCount = 5
     val readCount = 100
     println("You have ${unreadCount + readCount} total messages in your inbox.")

     val numberOfPhotos = 100
     val photosDeleted = 10
     println("$numberOfPhotos photos")
     println("$photosDeleted photos deleted")
     println("${numberOfPhotos - photosDeleted} photos left")

     val trip1 = 3.20
     val trip2 = 4.10
     val trip3 = 1.72
     val totalTripLength = trip1 + trip2 + trip3
     println("$totalTripLength miles left to destination")

     val notificationsEnabled = true
     println(notificationsEnabled)

     var year: Int
     year = 2023
     println(year)

     //val greeting = birthdayGreeting()
     //println(greeting)

     println(birthdayGreeting(age=10))
     println(birthdayGreeting("Rex",23))


 }

fun birthdayGreeting(name: String="Wilson", age: Int): String{
    //val nameGreeting = "Happy Birthday, $name!"
    //val ageGreeting = "You are now $age years old!"

    //return "$nameGreeting\n$ageGreeting"
    return "Happy Birthday, $name!, You are now $age years old!"
}



//este es un comentario de una sola linea

/*
este es un
comentario
de varias
lineas
 */
