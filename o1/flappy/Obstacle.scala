package o1.flappy

import o1.*

import scala.util.Random
import scala.util.Random.*

// This class is introduced in Chapter 2.6.

class Obstacle(val radius: Int):

  private var currentPos = randomLaunchPosition()


  def pos = this.currentPos

  def approach() =
    if this.isActive
      then this.currentPos = this.currentPos.addX(-ObstacleSpeed)
    else currentPos = randomLaunchPosition()

  override def toString = "center at " + this.pos + ", radius " + this.radius

  def touches(bug: Bug): Boolean =
    val distance = this.pos.distance(bug.pos)
    distance < (this.radius + bug.radius)

  def isActive = pos.x >= -radius


  private def randomLaunchPosition() =
    val launchX = 1250 + radius + Random.nextInt(5)
    val launchY = Random.nextInt(150)
    Pos(launchX, launchY)


end Obstacle