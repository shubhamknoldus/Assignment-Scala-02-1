package edu.knoldus.operations

class HappyNumber {

  def isHappyNumber(input: Int): Boolean = {
    val listOfSum = List()

    def happyHelper(number: Int, list: List[Int]): Boolean = {

      if (list.contains(number)) {
        false
      } else {
        if (returnSumOfDigitsSquare(number) == 1) {
          true
        } else {
          happyHelper(returnSumOfDigitsSquare(number), number :: list)
        }
      }
    }

    def returnSumOfDigitsSquare(input: Int): Int = {
      if (input == 0) {
        0
      } else {
        val mod = input % 10
        (mod * mod) + returnSumOfDigitsSquare(input / 10)
      }
    }

    happyHelper(input, listOfSum)
  }
}
