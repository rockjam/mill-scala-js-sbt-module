package app

object SJSMain extends App {
  def add(a: Int, b: Int) =  a+b

  def hlistMake(a: Int, b: String) = {
    import shapeless._
    a :: b :: HNil
  }

  println("hello world")
}
