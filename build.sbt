ThisBuild / organization := "io.github.yangzai"
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.8"
ThisBuild / crossScalaVersions += "2.11.12"

ThisBuild / wartremoverErrors ++= Warts.all

lazy val core = project in file("suppressor-core") settings(
  name := "wartremover-suppressor-core"
)

lazy val contrib = project in file("suppressor-contrib") dependsOn core settings(
  name := "wartremover-suppressor-contrib"
)

lazy val root = project in file(".") aggregate(core, contrib) dependsOn core settings(
  name := "wartremover-suppressor"
)

useGpg := true
ThisBuild / publishTo := sonatypePublishTo.value
