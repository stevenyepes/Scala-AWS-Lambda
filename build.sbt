name := "ren-tuya"

version := "0.1"

scalaVersion := "2.12.7"

val circeVersion = "0.10.0"


libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-lambda-java-core" % "1.1.0",
  "com.amazonaws" % "aws-lambda-java-events" % "2.2.2",
  "com.amazonaws" % "aws-lambda-java-log4j" % "1.0.0",
  ("com.amazonaws" % "aws-lambda-java-log4j2" % "1.0.0").
    exclude("org.apache.logging.log4j", "log4j-core")
)

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

libraryDependencies ++= Seq(
  "io.github.yeghishe" %% "scala-aws-lambda-utils" % "0.0.3"
)


assemblyJarName in assembly := s"${name.value}.jar"

