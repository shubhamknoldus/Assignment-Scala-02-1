package edu.knoldus.operations

class RunLengthCoding {

  def runLengthEncoding(input: List[String]):List[(String, Int)] = {
    val outputList: List[(String, Int)] = List()


    def runLengthHelper(currentString:String, count: Int,inputStringList: List[String],outputTuple: List[(String, Int)]):List[(String, Int)] = {
      inputStringList match{
        case head :: Nil => if(currentString == head){
          runLengthHelper(head, count + 1, Nil, outputTuple)
        }else{
          runLengthHelper(head, 1, Nil, (currentString, count) :: outputTuple)
        }
        case head :: tail =>
          if(head == currentString){
            runLengthHelper(head, count + 1, tail, outputTuple)
          } else{
            runLengthHelper(head, 1, tail, (currentString, count) :: outputTuple)
          }

        case Nil => outputTuple

      }
    }

    input match{
      case head :: tail =>
        outputList ::: runLengthHelper(head, 1, tail, outputList)
      case Nil =>
        outputList
    }
  }

}
