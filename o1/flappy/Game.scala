package o1.flappy

import o1._

class Game:
  val bug = Bug(Pos(100.0, 40.0))
  val obstacles = Vector(Obstacle(70), Obstacle(30), Obstacle(20))

  def timePasses(): Unit = {
    bug.fall()
    obstacles.foreach(_.approach())  
  }

  def activateBug(): Unit = {
    bug.flap(15)
  }

  def isLost: Boolean =
    !bug.isInBounds || obstacles.exists(_.touches(bug))  

end Game
