name := """play-java-forms-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)
  //.enablePlugins(PlayNettyServer).disablePlugins(PlayPekkoHttpServer) // uncomment to use the Netty backend

crossScalaVersions := Seq("2.13.15", "3.3.3")

scalaVersion := crossScalaVersions.value.head

(Test / testOptions) := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))

libraryDependencies += guice

scalacOptions ++= List("-Werror")
javacOptions ++= Seq(
  "-Xlint:unchecked",
  "-Xlint:deprecation",
  "-Werror"
)

// Dependencias necesarias
libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % scalaVersion.value, // Dependencia de Scala
  "org.typelevel" %% "cats-core" % "2.6.1", // Ejemplo de otra dependencia (puedes agregar más)
  "com.typesafe" % "config" % "1.4.1" // Otra dependencia común (ejemplo)
)

// Configuración adicional de compilación
compile in Compile := ((compile in Compile) dependsOn clean).value