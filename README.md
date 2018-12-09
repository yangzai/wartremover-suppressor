# Wartremover Suppressor

## Concise and typesafe annotation constants for suppressing warnings from [WartRemover](https://github.com/wartremover/wartremover)

|Suppressor|WartRemover|Contrib|
|----------|-----------|-------|
|0.1.0     |2.7.3      |1.2.4  |


### SBT Setup
If only the standard `Warts` are required:
```scala
libraryDependencies += "io.github.yangzai" %% "wartremover-suppressor" % "0.1.0"
```

If `ContribWarts` are also required:
```scala
libraryDependencies += "io.github.yangzai" %% "wartremover-suppressor-contrib" % "0.1.0"
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
