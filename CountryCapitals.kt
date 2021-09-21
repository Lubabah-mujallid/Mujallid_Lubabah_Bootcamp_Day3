/*Country Capitals (Dictionary)
Create a mutable dictionary
Ask users to enter a country and save it as the key
Ask user to enter a capital and save it as the value
After user has entered 3 pairs, print each country and its capital*/

fun main() {
    val countryDict = mutableMapOf<String, String>()
    var counter = 0
    while (counter < 3) {
        print("tell me a country name: ")
        val country = readLine()!!
        print("tell me its capital name: ")
        val capital = readLine()!!
        if (country.isEmpty() || capital.isEmpty()){
            println("nope, try again")
            continue
        }
        countryDict.put(country, capital)
        counter++
    }
    for ((key, value) in countryDict) {
        println("for the $key the capital is $value")
    }
}