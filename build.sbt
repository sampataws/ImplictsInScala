name := "ImplictsInScala"

version := "0.1"

scalaVersion := "2.11.12"


val sparkVersion = "2.4.5"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-sql" % sparkVersion  % "provided",
  "org.apache.logging.log4j" % "log4j-api" % "2.12.1" % "provided" ,
  "com.typesafe" % "config" % "1.3.1",
  "org.scalatest" %% "scalatest" % "3.2.0" % "test",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
  "net.liftweb" %% "lift-json" % "2.6-M4"
)



dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-core" % "2.8.7"
dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.8.7"
dependencyOverrides += "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.8.7"

updateOptions := updateOptions.value.withGigahorse(false)
