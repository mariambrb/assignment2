import android.R



fun main() {
    // GCD function
    fun gcd(num1: Int, num2: Int): Int {
        if (num2 == 0) {
            return num1
        }
        return gcd(num2, num1 % num2)
    }

    // LCM function
    fun lcm(num1: Int, num2: Int): Int {
        return Math.abs(num1 * num2) / gcd(num1, num2)
    }

    // Check if the string contains '$'
    fun returnsDollarSign(takesString: String): Boolean {
        return takesString.contains("$")
    }

    // Recursive function to sum even numbers up to 100
    fun countEvenNumbers(number: Int, summed: Int): Int {
        if (number <= 0) {
            return summed
        }
        return countEvenNumbers(number - 2, summed + number)
    }

    // Reverse a number function
    fun returnReversed(input: String): String {
        if (input.isNullOrBlank() || !input.all { it.isDigit() }) {
            return "Insert only numbers"
        } else {
            var reversed = input.reversed()
            if (reversed[0] == '0') {
                reversed = reversed.substring(1)
            }
            return reversed
        }
    }

    // Palindrome checker function
    fun palindromeChecker(str: String?): String {
        return if (str.isNullOrBlank()) {
            "no input provided"
        } else {
            val reversedStr = str.reversed()
            if (reversedStr == str) {
                "this is palindrome"
            } else {
                "not palindrome"
            }
        }
    }

    // Menu to select the function
    println("Choose a function to use:")
    println("1. Calculate GCD and LCM")
    println("2. Check for '$' in a string")
    println("3. Sum even numbers up to 100")
    println("4. Reverse a number")
    println("5. Check if a string is a palindrome")
    println("Enter your choice (1-5):")

    val choice = readLine()?.toIntOrNull() ?: 0

    when (choice) {
        1 -> {
            println("Enter two numbers to calculate GCD and LCM:")
            val num1 = readLine()?.toIntOrNull() ?: 0
            val num2 = readLine()?.toIntOrNull() ?: 0
            println("The GCD of $num1 and $num2 is ${gcd(num1, num2)}")
            println("The LCM of $num1 and $num2 is ${lcm(num1, num2)}")
        }
        2 -> {
            println("Enter a string to check for '$':")
            val takesString = readLine() ?: ""
            println("Contains '$': ${returnsDollarSign(takesString)}")
        }
        3 -> {
            println("Summing even numbers up to 100:")
            println("Sum of even numbers: ${countEvenNumbers(100, 0)}")
        }
        4 -> {
            println("Enter a number to reverse:")
            val input = readLine() ?: ""
            println("Reversed number: ${returnReversed(input)}")
        }
        5 -> {
            println("Enter a string to check if it's a palindrome:")
            val str = readLine()
            println(palindromeChecker(str))
        }
        else -> {
            println("Invalid choice, select a number between 1 and 5.")
        }
    }
}









