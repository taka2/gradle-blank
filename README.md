gradle-blank
============
Tasks

Category | Task | Description
----- | ----- | -----
Application tasks | distTar | Bundles the project as a JVM application with libs and OS specific scripts.
Application tasks | distZip | Bundles the project as a JVM application with libs and OS specific scripts.
Application tasks | installApp | Installs the project as a JVM application along with libs and OS specific scripts.
Application tasks | run | Runs this project as a JVM application
Build tasks | assemble | Assembles the outputs of this project.
Build tasks | build | Assembles and tests this project.
Build tasks | buildDependents | Assembles and tests this project and all projects that depend on it.
Build tasks | buildNeeded | Assembles and tests this project and all projects it depends on.
Build tasks | classes | Assembles classes 'main'.
Build tasks | clean | Deletes the build directory.
Build tasks | jar | Assembles a jar archive containing the main classes.
Build tasks | testClasses | Assembles classes 'test'.
Build Setup tasks | init | Initializes a new Gradle build. [incubating]
Build Setup tasks | wrapper | Generates Gradle wrapper files. [incubating]
Documentation tasks | javadoc | Generates Javadoc API documentation for the main source code.
Help tasks | components | Displays the components produced by root project 'gradle-blank'. [incubating]
Help tasks | dependencies | Displays all dependencies declared in root project 'gradle-blank'.
Help tasks | dependencyInsight | Displays the insight into a specific dependency in root project 'gradle-blank'.
Help tasks | help | Displays a help message.
Help tasks | projects | Displays the sub-projects of root project 'gradle-blank'.
Help tasks | properties | Displays the properties of root project 'gradle-blank'.
Help tasks | tasks | Displays the tasks runnable from root project 'gradle-blank'.
Verification tasks | check | Runs all checks.
Verification tasks | test | Runs the unit tests.
Other tasks | jacocoTestReport | Create a jacoco test report. depends on test task.


Proxy Setting

${HOME}/.gradle/gradle.properties

```
systemProp.http.proxyHost=www.somehost.org
systemProp.http.proxyPort=8080
systemProp.http.proxyUser=userid
systemProp.http.proxyPassword=password
systemProp.http.nonProxyHosts=*.nonproxyrepos.com|localhost
systemProp.https.proxyHost=www.somehost.org
systemProp.https.proxyPort=8080
systemProp.https.proxyUser=userid
systemProp.https.proxyPassword=password
systemProp.https.nonProxyHosts=*.nonproxyrepos.com|localhost
```
