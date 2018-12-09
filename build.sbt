ThisBuild / organization := "io.github.yangzai"

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

ThisBuild / publishTo := sonatypePublishTo.value

import ReleaseTransformations._

releaseCrossBuild := true
releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  releaseStepCommandAndRemaining("+publishSigned"),
  setNextVersion,
  commitNextVersion,
  releaseStepCommand("sonatypeReleaseAll"),
  pushChanges
)
