# Wartremover Suppressor

## Concise and typesafe annotation constants for suppressing warnings from [WartRemover](https://github.com/wartremover/wartremover)

|Suppressor|WartRemover|Contrib|
|----------|-----------|-------|
|0.1.0     |2.7.3      |1.2.4  |

### SBT Setup
Ideally, there is is no need to include the suppressor as a runtime dependency.
Below shows how the scope can be restricted to compile-time only.
Otherwise, `Provided` scope is good enough for most cases.
```scala
// CompileOnly hack - like Provided, but doesn't show on POM
// Reference: https://github.com/sbt/sbt/issues/2503
val CompileOnly = config("compile-only").hide
ivyConfigurations += CompileOnly
unmanagedClasspath in Compile ++= update.value select configurationFilter(CompileOnly.name)

// If only the standard Warts are required
libraryDependencies += "io.github.yangzai" %% "wartremover-suppressor" % "0.1.0" % CompileOnly

// If ContribWarts are also required
libraryDependencies += "io.github.yangzai" %% "wartremover-suppressor-contrib" % "0.1.0" % CompileOnly
```

### Example
```Scala
import org.wartremover.suppressor.Wart

@SuppressWarnings(Array("org.wartremover.warts.Null", "org.wartremover.warts.Var"))
var withoutSuppressor: String = null
withoutSuppressor = "withoutSuppressor"

@SuppressWarnings(Array(Wart.Null, Wart.Var))
var withSuppressor: String = null
withSuppressor = "withSuppressor"
```
