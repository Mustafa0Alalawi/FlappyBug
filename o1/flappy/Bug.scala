package o1.flappy

import o1.*

class Bug(private var nowPos: Pos):

  def pos = nowPos

  val radius = 15
  private var yVelocity = 0.0


  def fall() = {
  if pos.y < 350.0 then yVelocity += 2
  nowPos = pos.addY(yVelocity).clampY(0.0, 350.0)

  }



  def flap(amount: Double) = {
  yVelocity = - amount
  }


  override def toString: String = {
  s"center at $pos, radius $radius"
  }

  def isInBounds: Boolean =
    this.pos.y > 0 && this.pos.y < 350

end Bug





