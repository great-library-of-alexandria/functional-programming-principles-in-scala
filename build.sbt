ThisBuild / scalaVersion := "2.13.4"

lazy val progfun = project.in(file("."))

lazy val week1 = project.in(file("week1"))
  .settings(libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test)
  .aggregate(example, recfun)

lazy val example = project.in(file("week1/example"))

lazy val recfun = project.in(file("week1/recfun"))

lazy val week2 = project.in(file("week2"))
  .settings(libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test)

lazy val week3 = project.in(file("week3"))
  .settings(libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test)

lazy val week4 = project.in(file("week4"))
  .settings(libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test)
