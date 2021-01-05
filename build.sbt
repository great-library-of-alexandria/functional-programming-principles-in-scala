ThisBuild / scalaVersion := "2.13.4"

lazy val progfun = project.in(file("."))
  .aggregate(
    example,
    recfun,
    funsets,
    objsets,
    patmat,
    forcomp
  )

lazy val example = project.in(file("example"))
  .settings(libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test)

lazy val recfun = project.in(file("recfun"))
  .settings(libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test)

lazy val funsets = project.in(file("funsets"))
  .settings(libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test)

lazy val objsets = project.in(file("objsets"))
  .settings(libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test)

lazy val patmat = project.in(file("patmat"))
  .settings(libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test)

lazy val forcomp = project.in(file("forcomp"))
  .settings(libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test)
