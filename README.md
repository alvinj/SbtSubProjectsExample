A Scala SBT Example Using Sub-Projects
======================================

This is a template that you can use (or refer to) when creating sub-projects beneath a main project when using SBT. This project follows the SBT documentation at the following URL, with a few minor differences:

https://github.com/harrah/xsbt/wiki/Getting-Started-Multi-Project

Take a look at the following files and notice the dependencies:

<pre>
src/main/scala/Hello.scala   // uses Foo and Bar
project/Build.scala          // part of the build process, sets up aggregate and
                             // dependsOn relationships
</pre>

You should be able to run all the usual SBT commands from the root directory, including:

<pre>
$ sbt compile
$ sbt test
$ sbt run
</pre>

Checkout a Copy
---------------

You can checkout a read-only copy of this project using "git clone <url>".

Notes
-----

Note: All the little ".gitignore" files are in the empty subdirectories so those directories would be checked into Git. (Git doesn't like empty directories, so you have to do something to get it to keep empty directories in the repo.)

More Information
----------------

For more information, see https://github.com/harrah/xsbt/wiki/Getting-Started-Multi-Project


Alvin Alexander  
http://alvinalexander.com

