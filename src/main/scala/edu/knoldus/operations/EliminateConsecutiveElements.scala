package edu.knoldus.operations

class EliminateConsecutiveElements {

  def compressList(list: List[Char]): List[Char] = {

    val outputList = List()

    def helperFunction(input: List[Char], output: List[Char]): List[Char] = {

      input match {
        case Nil => input
        case head :: Nil => input
        case head :: head2 :: Nil =>
          if (head == head2) {
            output ::: List(head)
          } else {
            output ::: List(head, head2)
          }
        case head :: head2 :: tail =>
          if (head == head2) {
            helperFunction(head2 :: tail, output)
          } else {
            helperFunction(head2 :: tail, output ::: List(head))
          }
      }
    }

    helperFunction(list, outputList)

  }

}
