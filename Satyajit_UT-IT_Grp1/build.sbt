name := "UT-IT"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest-flatspec" % "3.2.2" % "test",
  "org.mockito" %% "mockito-scala" % "1.16.15" % Test)
lazy val core = project.in(file("Q1&2"))
  .settings(
    libraryDependencies += "org.scalatest" %% "scalatest-flatspec" % "3.2.2" % "test"
  )
lazy val root = project.in(file(".")) aggregate (core)
