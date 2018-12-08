# Wartremover Suppressor

## Concise and typesafe annotation constants for suppressing warnings from [WartRemover](https://github.com/wartremover/wartremover)

### SBT Setup
If only the standard `Warts` are required:
```scala
libraryDependencies += "io.github.yangzai" %% "wartremover-suppressor-core" % "2.3.7-SNAPSHOT"
```

If only the `ContribWarts` are required:
```scala
libraryDependencies += "io.github.yangzai" %% "wartremover-suppressor-contrib" % "1.2.4-SNAPSHOT"
```

Otherwise, if both are required:
```scala
libraryDependencies += "io.github.yangzai" %% "wartremover-suppressor" % "0.1.0-SNAPSHOT"
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
