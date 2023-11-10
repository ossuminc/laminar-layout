
import org.scalajs.linker.interface.ModuleSplitStyle
import scala.sys.process.Process

Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val lamlay = project.in(file("."))
  .enablePlugins(ScalaJSPlugin) // Enable the Scala.js plugin in this project
  .enablePlugins(ScalablyTypedConverterExternalNpmPlugin)
  .settings(
    name := "laminar-layout",
    scalaVersion := "3.3.1",

    // Tell Scala.js that this is an application with a main method
    scalaJSUseMainModuleInitializer := true,

    // Tell Scala.js that the main class is named "Layout"
    mainClass := Some("com.ossuminc.lamlay.LaminarLayout"),

    /* Configure Scala.js to emit modules in the optimal way to
     * connect to Vite's incremental reload.
     * - emit ECMAScript modules
     * - emit as many small modules as possible for classes in the "livechart" package
     * - emit as few (large) modules as possible for all other classes
     *   (in particular, for the standard library)
     */
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.ESModule)
        .withModuleSplitStyle(
          ModuleSplitStyle.SmallModulesFor(List("lamlay")))
    },

    // For ScalablyTyped
    externalNpm := {
      Process(Seq("npm", "install"), baseDirectory.value).!
      baseDirectory.value
    },
    Compile / npmDependencies.withRank(KeyRanks.Invisible)  := Seq(
      "chart.js" -> "2.9.4"
    ),

    /* Depend on the scalajs-dom library.
     * It provides static types for the browser DOM APIs.
     */
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "2.4.0",
      "com.raquo" %%% "laminar" % "16.0.0",
      "com.raquo" %%% "waypoint" % "7.0.0",
      "org.scala-js" %%% "scalajs-dom" % "2.2.0"
    )
  )
