object Assignments {

  def main(args: Array[String]) {

    println("Assignment 1: " + sum(1, 2)) //Assignment 1
    println("Assignment 2: " + myString("mark")) //Assignment 2
    println("Assignment 3: " + absDiff(54)) //Assignment 3
    println("Assignment 4: " + check30(10, 20)) //Assignment 4
    println("Assignment 5: " + check20(70)) //Assignment 5
    println("Assignment 6: " + checkIfStr("if else")) //Assignment 6
    println("Assignment 7: " + remChar("MarkDave", 6)) //Assignment 7
    println("Assignment 7: " + swapChar("mark")) //Assignment 8
  }

  //1. Write a Scala program to compute the sum of the two given integer values. If the two values are the same, then return triples their sum.

  def sum(a: Int, b: Int): Int = {
    var result = a + b
    if (a == b) (return result * 3) else (return result)
  }
  //2. Write a Scala program to create a new string with the last char added at the front and back of a given string of length 1 or more

  def myString(str: String): String = { //HW2
    val strLength = str.length
    val last = str.charAt(strLength - 1)

    val addChar = last + str + last
    return addChar
  }

  //3. Write a Scala program to get the absolute difference between n and 51. If n is greater than 51 return triple the absolute difference.

  def absDiff(num: Int): Int = { //HW3
    val absVal = Math.abs(num - 51)
    if (num > 51) absVal * 3 else absVal
  }

  //4. Write a Scala program to check two given integers, and return true if one of them is 30 or if their sum is 30.

  def check30(a: Int, b: Int): Boolean = { //HW4
    if (a == 30 || b == 30 || a + b == 30) true else false
  }

  //5. Write a Scala program to check a given integer and return true if it is within 20 of 100 or 300.

  def check20(num: Int): Boolean = {
    if ((Math.abs(100 - num) <= 20) || (Math.abs(300 - num) <= 20)) true
    else false
  }

  //6. Write a Scala program to create a new string where 'if' is added to the front of a given string. If the string already begins with 'if', return the string unchanged

  def checkIfStr(str: String): String = {
    if (str.startsWith("if")) str else "if " + str
  }

  //7. Write a Scala program to remove the character in a given position of a given string.The given position will be in the range 0...string length -1 inclusive.

  def remChar(str: String, n: Int): String = {
    str.take(n) + str.drop(n + 1)
  }

  //8. Write a Scala program to exchange the first and last characters in a given string and return the new string.

  def swapChar(str: String): String = {
    val len = str.length
    if (len <= 1) str
    else str.charAt(len - 1) + str.substring(1, len - 1) + str.charAt(0)
  }
}
