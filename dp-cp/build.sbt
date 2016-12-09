import Dependencies._
import scalariform.formatter.preferences._
import com.typesafe.sbt.SbtScalariform
import com.typesafe.sbt.SbtScalariform.ScalariformKeys

name in ThisBuild := "db-cp"

organization in ThisBuild := "com.starbucks.analytics"

version in ThisBuild := "0.1"

licenses in ThisBuild += ("Apache License, Version 2.0", url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

startYear in ThisBuild := Some(2018)

organizationName in ThisBuild := "Starbucks"

scalaVersion in ThisBuild := "2.12.1"

crossScalaVersions in ThisBuild := Seq("2.12.1")

libraryDependencies in ThisBuild ++= Seq(
  slf4j_api,
  logback,
  scopt,
  azure_data_lake_store_sdk)


resolvers in ThisBuild ++= Seq(

  "snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  "releases" at "https://oss.sonatype.org/content/repositories/releases"
)

SbtScalariform.scalariformSettings

ScalariformKeys.preferences := ScalariformKeys.preferences.value
  .setPreference(AlignParameters, true)
  .setPreference(IndentSpaces, 2)
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(AlignSingleLineCaseStatements.MaxArrowIndent, 100)
  .setPreference(DoubleIndentClassDeclaration, true)
  .setPreference(DanglingCloseParenthesis, Preserve)