fun main(){

    var Ferrari = Car("Toyota","cruisher","red",4)
    Ferrari .carry(6)
    Ferrari .idenntity()
    Ferrari .calculateParkingFees(7)
    var new = Bus("full","stradale","blue",10)
    new.Fare(100.0)
    new.calculateParkingFees(10)



}

open class Car (var make:String, var model:String , var colour:String , var capacity:Int) {

    fun carry (people:Int) {

        var x = people - capacity

        if (x>=5 )
            println("Carrying $people passengers.")
        else {
            println("Over capacity by $x people.")
        }

    }

    fun idenntity(){
        println("I am a $colour $make $model.")
    }

    open fun calculateParkingFees (hours:Int):Int {
        var parking = hours*20
        println("The parking fees is $parking")
        return parking

    }


}

class Bus(var make:String, var model:String , var colour:String , var capacity:Int) {
    fun Fare(fare: Double): Double {
        var z = capacity * fare
        println("The maximum amount of  trip  fare is $z USD.")
        return z

    }

    fun calculateParkingFees(hours: Int): Int {
        var t= capacity * hours
        println(t)
        return t

    }
}
