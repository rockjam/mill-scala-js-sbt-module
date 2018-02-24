import ammonite.ops._
import mill.{Agg, T, _}
import scalalib.{ScalaModule, _}
import scalajslib._

object frontEnd extends ScalaJSModule with SbtModule {
  def millSourcePath = pwd
  def scalaVersion = "2.12.4"
  def scalaJSVersion = "0.6.22"
  def mainClass = Some("app.SJSMain")

  def ivyDeps = Agg(
    ivy"com.chuusai::shapeless::2.3.3"
  )

  object test extends super[SbtModule].Tests with super[ScalaJSModule].Tests {
    def testFrameworks = Seq("utest.runner.Framework")
    def ivyDeps = Agg(
      ivy"com.lihaoyi::utest::0.6.3"
    )
  }
}
