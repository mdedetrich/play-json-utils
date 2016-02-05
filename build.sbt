name := "play-json-utils"

scalaVersion := "2.11.7"

crossScalaVersions := Seq("2.11.7","2.10.5")

organization := "org.mdedetrich"

version := "1.0.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.4.6"
)

publishMavenStyle := true

pomIncludeRepository := { _ => false }

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomExtra := <url>https://github.com/mdedetrich/play-json-utils</url>
  <licenses>
    <license>
      <name>BSD-style</name>
      <url>http://www.opensource.org/licenses/bsd-license.php</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:mdedetrich/play-json-utils.git</url>
    <connection>scm:git:git@github.com:mdedetrich/play-json-utils.git</connection>
  </scm>
  <developers>
    <developer>
      <id>mdedetrich</id>
      <name>Matthew de Detrich</name>
      <email>mdedetrich@gmail.com</email>
    </developer>
  </developers>