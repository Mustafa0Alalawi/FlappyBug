package o1.flappy

import o1._

// This class is introduced in Chapter 2.7.

val sky        = rectangle(ViewWidth, ViewHeight,  LightBlue)
val ground     = rectangle(ViewWidth, GroundDepth, SandyBrown)
val trunk      = rectangle(30, 250, SaddleBrown)
val foliage    = circle(200, ForestGreen)
val tree       = trunk.onto(foliage, TopCenter, Center)
val rootedTree = tree.onto(ground, BottomCenter, Pos(ViewWidth / 2, 30))
val scenery    = sky.place(rootedTree, BottomLeft, BottomLeft)

val bugPic = Pic("ladybug.png")

def rockPic(obstacle: Obstacle) = circle(obstacle.radius * 2, Black)
val game = Game()

object flappyView extends View(game, "FlappyBug"):
  var background = scenery

  def makePic: Pic =
    game.obstacles.foldLeft(background) { (currentPic, obstacle) =>
        currentPic.place(rockPic(obstacle), obstacle.pos)
    }.place(bugPic, game.bug.pos)

  override def onTick(): Unit =
    game.timePasses()
    this.background = this.background.shiftLeft(2)

  override def onKeyDown(pressedKey: Key) =
    if pressedKey == Key.Space then game.activateBug()

  override def isDone = game.isLost

@main def launchFlappy() = flappyView.start()
