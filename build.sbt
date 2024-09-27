import kotlin.Keys.*
import kotlin.KotlinPlugin

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

lazy val root = (project in file("."))
  .dependsOn(kt, sc)
  .settings(
    name := "untitled63",
    sourcesInBase := false,
  )

lazy val kt = (project in file("kt"))
  .enablePlugins(KotlinPlugin)
  .settings(
    kotlinVersion := "2.0.0",
    kotlincJvmTarget := "17",
    kotlinRuntimeProvided := false,
  )

lazy val sc = (project in file("sc"))
  .dependsOn(kt)
