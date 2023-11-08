import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

open class SmartDevice protected constructor(val name: String, val category: String){

   // val name
   // val category = "Entertainment"
    var deviceStatus = "online"
       protected set

    open val deviceType = "unknown"

    constructor(name: String, category: String, statusCode: Int):this(name, category){

        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    open fun turnOn(){
        deviceStatus = "on"
        //println("Smart device is turned on.")

    }

    open fun turnOff(){
        deviceStatus = "off"
        //println("Smart device is turned off.")
    }

    open fun printDeviceInfo(){
        println("Device name: $name, category: $category, type: $deviceType")
    }
}


class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    private var speakerVolume by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)

    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)

    override val deviceType = "Smart TV"
/*
   private var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    private var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

 */


    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    internal fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    fun decreaseVolume(){
        speakerVolume--
        println("Speaker volume decreased to $speakerVolume.")

    }

    fun previousChannel(){
        channelNumber--
        println("Channel number decreased to $channelNumber.")
    }

}


class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    private var brightnessLevel by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)


    override val deviceType = "Smart Light"
/*
    private var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

 */

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }


    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }

    fun decreaseBrightness(){
        brightnessLevel--
        println("Brightness decreased to $brightnessLevel.")
    }

}


// The SmartHome class HAS-A smart TV device.
class SmartHome (
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
    ){

    var deviceTurnOnCount = 0
        private set

    fun turnOnTv(){
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun turnOnLight() {
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }

    //decreaseTvVolume(), changeTvChannelToPrevious(), printSmartTvInfo(), printSmartLightInfo() y decreaseLightBrightness().

    fun decreaseTvVolume(){
        smartTvDevice.decreaseVolume()
    }

    fun changeTvChannelToPrevious(){
        smartTvDevice.previousChannel()

    }

    fun printSmartTvInfo(){
        smartTvDevice.printDeviceInfo()

    }

    fun printSmartLightInfo(){
        smartLightDevice.printDeviceInfo()

    }

    fun decreaseLightBrightness(){
        smartLightDevice.decreaseBrightness()
    }


}


class RangeRegulator(
     initialValue: Int,
     private val minValue: Int,
     private val maxValue: Int
     ) : ReadWriteProperty<Any?, Int> {

    var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            fieldData = value
        }

    }
}

fun main(){
    /*
    val smartTvDevice = SmartDevice("Android TV","Entertainment",1)
    println("Device name is ${smartTvDevice.name}")
    println(smartTvDevice.deviceStatus)
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()

    var smartDevice: SmartDevice = SmartTvDevice("Android TV", "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()

     */

    val smartHome = SmartHome(
        SmartTvDevice(deviceName = "Android TV", deviceCategory = "Entertainment"),
        SmartLightDevice(deviceName = "Google light", deviceCategory = "Utility")
    )

    smartHome.turnOnTv()
    smartHome.turnOnLight()
    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}")
    println()

    smartHome.increaseTvVolume()
    smartHome.changeTvChannelToNext()
    smartHome.increaseLightBrightness()
    println()

    smartHome.changeTvChannelToPrevious()
    smartHome.decreaseLightBrightness()
    smartHome.decreaseTvVolume()
    smartHome.printSmartLightInfo()
    smartHome.printSmartTvInfo()
    println()

    smartHome.turnOffAllDevices()
    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}.")
}



