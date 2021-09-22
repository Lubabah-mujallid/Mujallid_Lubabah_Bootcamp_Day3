/*
Randomly select three countries and quiz the user to see if they know the capitals
If the user guesses incorrectly call the capital function to show the answer
Give the user a final score out of 3 at the end of the game
Start a new game if they want to play again

Bonus:

Can you find a way to always ask 3 unique questions?
(Never repeating the same country in a single game)*/

class Country(val country: String, val capital: String) {
    fun capital() {
        println("The capital of $country, is $capital!! ")
    }
}

fun main() {
    println(
        "HUMAN! HUMAN! " +
                "\nYou know about my to countries to destroy, AHEM! I mean to visit list right?" +
                "\nI will tell you the country name and you will have to me its capital's name." +
                "\nIf you make more than 2 mistake, I WILL THROW YOU OUT IN SPACE!!" +
                "HOHOHOHOHOHOHOHOHOHO!!" +
                "I wish to visit 3 countries!! :)" +
                "\nHOHOHO!! *more evil luaghter*" +
                "\nNOW, GIVE ME THE NAMES! *creepy smile* -takes notebook and pen out ot write-"
    )

    val countriesList = listOf<Country>(
        Country("KSA", "Riyadh"),
        Country("USA", "Washington"),
        Country("Japan", "Tokyo"),
        Country("UK", "London"),
        Country("Korea", "Seoul"),
        Country("Egypt", "Cairo"),
        Country("Canada", "Ottawa"),
        Country("Turkey", "Ankara"),
        Country("Philippines", "Manila"),
        Country("Brazil", "Brasilia")
    )
    while (true) {
        var score: Int = 0
        val randomCountryList = countriesList.shuffled()
        for (i in 0..2) {
            print("${randomCountryList[i].country}'s Capital is? *expectant stare*")
            val capital = readLine()!!
            if (randomCountryList[i].capital.compareTo(capital, ignoreCase = true) == 0) {
                score++
            } else {
                randomCountryList[i].capital()
                println("HMMPH! NEXT QUESTION! *rolls his eyes* -mutters: stupid humans-")
            }
        }
        println(
            "*long sigh*" +
                    "\nOK! look human, I always cheat in theses games but not this time" +
                    "\nout of three questions, you got $score right"
        )
        if (score == 3) {
            println("I admit, you suprised me, human. " +
                    "\nI will come after i finish my countries to des- I mean to visit list. *innocent smile*")
        } else {
            println("*sigh* -mutters:stupid human-" +
                    "\nIt was good knowing you, BYE BYE! -preparing to throw you into space-" +
                    "\n-stops-" +
                    "\nHMMM! SHOULD I GIVE YOU A SECOND CHANCE? y/n")
            val answer = readLine()!!.first()
            if(answer.compareTo('y') == 0)
                continue
        }
        break
    }

}
