package jaskell.parsec

/**
 * Int try to parse a long as long int from state and without signed.
 *
 * @author mars
 * @version 1.0.0
 */
class UInt extends Parsec[String, Char]{
  val psc = new Many1[Char, Char](new Digit())

  override def ask(s: State[Char]): Either[Exception, String] = {
    psc ? s map {_.mkString}
  }
}

object UInt {
  def apply(): UInt = new UInt()
}