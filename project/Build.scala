import sbt._
import Keys._

/**
 * based on https://github.com/harrah/xsbt/wiki/Getting-Started-Multi-Project
 */
object HelloBuild extends Build {

  // aggregate: running a task on the aggregate project will also run it on the aggregated projects.
  // dependsOn: a project depends on code in another project.
  // without dependsOn, you'll get a compiler error: "object bar is not a member of package
  // com.alvinalexander".
  lazy val root = Project(id = "hello",
                          base = file(".")) aggregate(foo, bar) dependsOn(foo, bar)

  // sub-project in the Foo subdirectory
  lazy val foo = Project(id = "hello-foo",
                         base = file("Foo"))

  // sub-project in the Bar subdirectory
  lazy val bar = Project(id = "hello-bar",
                         base = file("Bar"))
}
