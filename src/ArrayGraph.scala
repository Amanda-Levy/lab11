package src

class ArrayGraph(graph: Array[Any]) {

  // note that the graph argument for the constructor is the graph that you
  // should run these methods on

  //TODO: Fill out this method!
  def isValid(): Boolean = {
    for (element <- graph) {
      element match {
        case e: String =>
        case e: Int =>
          if (graph.length > e) {
            graph(e) match {
              case e: Int    => return false
              case b: String =>
              case _         => return false
            }
          } else {
            return false
          }
        case _ => return false
      }
    }
    true
  }

  //TODO: Fill out this method!
  def markGraph(start: Int): Set[Int] = {
    if (!this.isValid || start >= graph.length) {
      throw new IllegalArgumentException()
    }
    graph(start) match {
      case e: Int    => throw new IllegalArgumentException()
      case e: String =>
    }
    var check = List(graph(start))
    val visited = scala.collection.mutable.ListBuffer[Int]()
    while (!check.isEmpty) {
      val next = check.head
      check = check.tail
      val plusIndex = 0
        visited += start + plusIndex

          if (!visited.contains(newNode))
            check = newNode :: check
      }
    }
    false
  }

  //TODO: Fill out this method!
  def usedLocations(startLocations: List[Int]): Set[Int] = {
    Set(1)
  }

  // this might be helpful for debugging!
  override def toString: String = {
    var output = ""
    for (item <- graph) {
      item match {
        case vertex: String => output += (vertex + "\n")
        case edge: Int      => output += (" => " + graph(edge) + "\n")
      }
    }
    output
  }
}
