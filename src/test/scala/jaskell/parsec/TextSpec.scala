package jaskell.parsec

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

/**
 * TODO
 *
 * @author mars
 * @version 1.0.0
 * @since 2020/05/12 12:35
 */
class TextSpec extends AnyFlatSpec with Matchers {
  "Simple" should "Reun some simple tests" in {
    import Txt._
    val state = State("Hello World");
    for {
      head <- "Hello" either state
      _ <- skipSpaces either state
      tail <- text("world", caseSensitive = false) either state
    } yield {s"$head $tail"} match {
      case content: String => content should be ("Hello World")
    }
  }
}