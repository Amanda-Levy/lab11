package src

import tester.Tester
class Lab11TestSuite {

  def testIsValid(t: Tester): Unit = {
    val allInt = new ArrayGraph(Array(1, 2, 3, 3))
    val correct = new ArrayGraph(Array("Vdub", "Andrews", 1, 0, "Ratty", 4))
    val outOfRange = new ArrayGraph(Array("Vdub", "Andrews", 1, 0, "Ratty", 6))
    t.checkExpect(!allInt.isValid)
    t.checkExpect(correct.isValid())
    t.checkExpect(!outOfRange.isValid())
  }
}

object Lab11TestSuite {
  def main(args: Array[String]): Unit = {
    Tester.run(new Lab11TestSuite())
  }
}
