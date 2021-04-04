package src

class ArrayGraph(graph: Array[Any]) {

  // note that the graph argument for the constructor is the graph that you
  // should run these methods on

  //TODO: Fill out this method!
  def isValid(): Boolean = {
    false
  }

  //TODO: Fill out this method!
  def markGraph(start: Int): Set[Int] = {
    Set(1)
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
        case vertex : String => output += (vertex + "\n")
        case edge : Int => output += (" => " + graph(edge) + "\n")
      }
    }
    output
  }
}