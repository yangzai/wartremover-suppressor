ThisBuild / organization := "io.github.yangzai"
ThisBuild / scalaVersion := "2.12.8"
ThisBuild / crossScalaVersions := Seq(scalaVersion.value, "2.11.12")

ThisBuild / wartremoverErrors ++= Warts.all

lazy val core = project in file("suppressor-core") settings(
  name := "wartremover-suppressor-core",
  version := "2.3.7-SNAPSHOT"
)

lazy val contrib = project in file("suppressor-contrib") dependsOn core settings(
  name := "wartremover-suppressor-contrib",
  version := "1.2.4-SNAPSHOT"
)

lazy val root = project in file(".") dependsOn(core, contrib) enablePlugins SbtOsgi settings(
  name := "wartremover-suppressor",
  version := "0.1.0-SNAPSHOT",
  osgiSettings,
  OsgiKeys.exportPackage := Seq("org.wartremover.suppressor.*;-split-package:=merge-first"),
  OsgiKeys.privatePackage := Seq.empty
)
