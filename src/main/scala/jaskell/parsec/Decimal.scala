package jaskell.parsec

import scala.collection.mutable

/**
 * TODO
 *
 * @author mars
 * @version 1.0.0
 * @since 2020/05/09 14:21
 */
class Decimal extends Parsec[String, Char]{
  val sign = new Ch('-')
  val udicemal = new UDecimal()
  override def apply[S <: State[Char]](s: S): String = {
    val sb: mutable.StringBuilder = new mutable.StringBuilder()
    sign.opt(s).foreach(x => sb += x)
    sb ++ udicemal(s)
    sb.mkString.asInstanceOf
  }
}