package edu.knoldus.application

import edu.knoldus.operations.{EliminateConsecutiveElements, HappyNumber, RotateList}
import org.apache.log4j.Logger

object ApplicationObject extends App {

  val logger = Logger.getLogger(this.getClass)
  val arg1 = 'Z'
  val arg2 = 'B'
  val arg3 = 'H'
  val arg4 = 'L'
  val arg5 = 'O'
  val arg6 = 'R'
  val list = List(arg1, arg2, arg3, arg4, arg5, arg6)
  val objRotateList = new RotateList
  logger.info(s"$list\n")
  logger.info(s"${objRotateList.rotateList(3, list)}\n")

  val listToCompress = List(arg2, arg2, arg2,
    arg1, arg1, arg6, arg5, arg5, arg1, arg3)

  val vr = new EliminateConsecutiveElements

  logger.info(s"$listToCompress \n ${vr.compressList(listToCompress)}\n")


  val range = (11 to 20).toList

  val happyObject = new HappyNumber

  range.map(x => logger.info(s"$x is happy number ${happyObject.isHappyNumber(x)}\n"))


}

