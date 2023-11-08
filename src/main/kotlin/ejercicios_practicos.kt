/*
fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if(numberOfMessages < 100){
        println("You have $numberOfMessages notifications.")
    }else{
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}
//---output----//
//You have 51 notifications.
//Your phone is blowing up! You have 99+ notifications.

 */


//--------------------------------------------------------------------------//
/*
fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {

    val price =
            when (age) {
                in 0..12 -> 15
                in 13..60 -> if (isMonday) 25 else 30
                in 61..100 -> 20
                else -> -1
        }
        return price
}


//---output--//
//The movie ticket price for a person aged 5 is $15.
//The movie ticket price for a person aged 28 is $25.
//The movie ticket price for a person aged 87 is $20.

 */

//--------------------------------------------------------------//

/*
De grados Celsius a Fahrenheit: °F = 9/5 (°C) + 32
Kelvin a Celsius: °C = K - 273.15
De Fahrenheit a Kelvin: K = 5/9 (°F - 32) + 273.15
 */
/*
fun main() {

    val celsius = 27.0
    val kelvin = 350.0
    val fahrenheit = 10.0

    printFinalTemperature(celsius,"Celsius","Fahrenheit") {(9*celsius)/5 + 32 }
    printFinalTemperature(kelvin,"Kelvin","Celsius") {kelvin-273.15}
    printFinalTemperature(fahrenheit,"Fahrenheit","Kelvin") {(5*(fahrenheit-32))/9 + 273.15}

}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

 */

//---output--//
//27.0 degrees Celsius is 80.60 degrees Fahrenheit.
//350.0 degrees Kelvin is 76.85 degrees Celsius.
//10.0 degrees Fahrenheit is 260.93 degrees Kelvin.

//-------------------------------------------------------------------//
/*
-Propiedades para el título, el artista, el año de publicación y el recuento de reproducciones

-Propiedad que indica si la canción es popular (si el recuento de reproducciones es inferior a 1,000, considera que es poco popular)

-Un método para imprimir la descripción de una canción en este formato:
"[Título], interpretada por [artista], se lanzó en [año de lanzamiento]".
 */
/*
class Song (val title: String, val artist: String, val year: Int, val playCount: Int){

    val isPopular = when(playCount){
        in 0..1000 -> "the song is not popular"
        else -> "the song is popular"
    }
    /*
    fun songIsPopular(){
        if(playCount > 1000){
            println("the song is popular")
        }else{
            println("the song is not popular")
        }
    }

     */

    fun descriptionSong(){
        println("$title, interpreted by $artist, launched in $year")
    }

}

fun main(){
    val song = Song("Satisfaction","Rolling Stones",1970,2000)
    song.descriptionSong()
    println(song.isPopular)
}

 */

//---------------------------------------------------------------------//
/*
fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {

    fun showProfile() {
        if (referrer != null) {
            println(
                "Name: $name \nAge: $age \nLikes to $hobby. Has a referrer named ${referrer.name}, " +
                        "who likes to ${referrer.hobby}."
            )
        } else
            println("Name: $name \nAge: $age \nLikes to $hobby. Doesn't have a referrer.\n")


    }
}

 */

//----output---//
/*
Name: Amanda
Age: 33
Likes to play tennis. Doesn't have a referrer.

Name: Atiqah
Age: 28
Likes to climb. Has a referrer named Amanda, who likes to play tennis.
 */

//--------------------------------------------------------------//

/*
En el código inicial que se proporciona en el siguiente fragmento de código,
escribe una clase FoldablePhone que se herede de la clase Phone. Debe contener lo siguiente:

- Una propiedad que indique si el teléfono está plegado
- Un comportamiento de función switchOn() diferente del de la clase Phone para que solo
encienda la pantalla cuando el teléfono no esté plegado
- Métodos para cambiar el estado de plegado
 */
open class Phone(var isScreenLightOn: Boolean = false){

   open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isPhoneFolded: Boolean = true) :
      Phone() {

    override fun switchOn() {
        if (!isPhoneFolded) {
            super.switchOn()
        }
    }

    fun isFolded() {
        isPhoneFolded = true
    }

    fun isUnfolded() {
        isPhoneFolded = false
    }

}
    fun main(){
        val newFoldablePhone = FoldablePhone()
        newFoldablePhone.switchOn()
        newFoldablePhone.checkPhoneScreenLight()
        newFoldablePhone.isUnfolded()
        newFoldablePhone.switchOn()
        newFoldablePhone.checkPhoneScreenLight()
    }


//-----------------------------------------------------//

/*
fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {

    return bid?.amount ?: minimumPrice

}

 */

//---output---//
//Item A is sold at 5000.
//Item B is sold at 3000.