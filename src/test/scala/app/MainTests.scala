package app

import utest._

object MainTests extends TestSuite {

  def tests = Tests {
    'one - {
      val result = SJSMain.add(1,2)
      assert(result == 3)
    }
    'hlist - {
      import shapeless._
      val l = 1 :: "hello" :: true :: HNil
      assert(
        l(1) == "hello"
      )
    }

  }

}
