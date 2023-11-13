addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.14.0")
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.17.0")
addSbtPlugin("org.scalablytyped.converter" % "sbt-converter" % "1.0.0-beta43")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.6.4")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.2")
addSbtPlugin("com.github.sbt" % "sbt-dynver" % "5.0.1")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.11.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.0.9")
addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.3.11")
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "3.1.5")

addSbtPlugin("com.github.sbt" % "sbt-native-packager" % "1.9.16")
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.1")

libraryDependencies += "org.scala-js" %% "scalajs-env-jsdom-nodejs" % "1.0.0"
