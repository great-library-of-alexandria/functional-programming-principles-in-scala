ThisBuild / scalaVersion := "2.13.4"

lazy val root = project.in(file("."))

lazy val week1 = project.in(file("week1"))
  .settings(libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test)
  .aggregate(example, recfun)

lazy val example = project.in(file("week1/example"))

lazy val recfun = project.in(file("week1/recfun"))
