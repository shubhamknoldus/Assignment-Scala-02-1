package edu.knoldus.operations

class RotateList {

  def rotateList(input: Int, inputList: List[Char]): List[Char] = {

    if (inputList.length < input) {
      inputList
    } else {
      inputList match {
        case head :: tail =>
          if (input > 0) {
            rotateList(input - 1, tail ::: List(head))
          } else {
            inputList
          }
      }
    }
  }
}
