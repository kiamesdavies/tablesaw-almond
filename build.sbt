import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1"
ThisBuild / organization     := "io.github.kiamesdavies"
ThisBuild / organizationName := "kiamesdavies"

lazy val root = (project in file("."))
  .settings(
    name := "tablesaw-almond"
  )

libraryDependencies ++= Seq(
    scalaTest % Test,
    "sh.almond" % "scala-kernel-api" % "0.6.0" cross CrossVersion.full  % "provided",
    "tech.tablesaw" % "tablesaw-core" % "0.34.1"  % "provided"
)


resolvers += Resolver.mavenLocal
resolvers += Resolver.jcenterRepo

// ThisBuild / description := "Provide helpers to make it easy to use Tablesaw with Almond"
// ThisBuild / licenses    := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
// ThisBuild / homepage    := Some(url("https://github.com/kiamesdavies/tablesaw-almond"))
// ThisBuild / scmInfo := Some(
//   ScmInfo(
//     url("https://github.com/your-account/your-project"),
//     "scm:git@github.com:your-account/your-project.git"
//   )
// )
// ThisBuild / developers := List(
//   Developer(
//     id    = "Your identifier",
//     name  = "Your Name",
//     email = "your@email",
//     url   = url("http://your.url")
//   )
// )
// ThisBuild / pomIncludeRepository := { _ => false }
// ThisBuild / publishTo := {
//   val nexus = "https://oss.sonatype.org/"
//   if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
//   else Some("releases" at nexus + "service/local/staging/deploy/maven2")
// }
// ThisBuild / publishMavenStyle := true
