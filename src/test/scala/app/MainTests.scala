package app

import utest._
import shapeless._

object MainTests extends TestSuite {

  def tests = Tests {
    'one - {
      val result = SJSMain.add(1,2)
      assert(result == 3)
    }
    'hlistMake - {
      val result = SJSMain.hlistMake(1, "hello")
      assert(
        result == 1 :: "hello" :: HNil
      )
    }
    'hlist - {
      val l = 1 :: "hello" :: true :: HNil
      assert(
        l(1) == "hello"
      )
    }

  }

}
