package app

import utest._

object MainTests extends TestSuite {

  def tests = Tests {
    'one - {
      val result = SJSMain.add(1,2)
      assert(result == 3)
    }

  }

}
