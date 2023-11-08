/*
fun main(){
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}
*/

//-----------------------------------------------------------//

/*
fun main() {
    println("New chat message from a friend")
}
*/

//------------------------------------------------------//

/*
fun main() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}
*/

//--------------------------------------------------//

/*
fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

 */

//----------------------------------------------------//
/*
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "${baseSalary + bonusAmount}"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

 */

//-----------------------------------------------------//
/*
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber

    println("$firstNumber + $secondNumber = $result")
}

 */

//-------------------------------------------------------//

/*
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")


    val resultSubstract = substract(firstNumber, secondNumber)
    val anotherResultSubstract = substract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $resultSubstract")
    println("$firstNumber - $thirdNumber = $anotherResultSubstract")
}

// Define add() function below this line

fun add(number1: Int, number2: Int): Int {

    return number1 + number2

}

fun substract(number1: Int, number2: Int): Int {

    return number1 - number2

}

 */

//-----------------------------------------------//
/*
fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

// Define your displayAlertMessage() below this line.

fun displayAlertMessage(operatingSystem: String, emailId: String): String {

    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}

 */

//-------------------------------------------------//

/*
fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {

    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}

 */

//---------------------------------------------------------------//
/*
fun main() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}

 */

//----------------------------------------------------------------//
/*
fun main(){
    println(compareUse(300, 100))
}

fun compareUse(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {

    return timeSpentToday > timeSpentYesterday

}

 */

//---------------------------------------------------------------//

fun main() {

    println(weatherCities("Ankara",27,31,82))
    println(weatherCities("Tokyo",32,36,10))
    println(weatherCities("Cape Town",59,64,2))
    println(weatherCities("Guatemala City",50,55,7))

}

fun weatherCities(city: String, lowTemperature: Int, highTemperature: Int, chanceOfRain: Int): String {

    return "City: $city\nLow temperature: $lowTemperature, High temperature: $highTemperature\nChance of rain: $chanceOfRain%\n"

}