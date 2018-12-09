package org.wartremover.suppressor

@SuppressWarnings(Array(Wart.FinalVal))
object Wart {
  private final val prefix = Core.root + "warts."
  final val All = prefix + "All"
  final val Any = prefix + "Any"
  final val AnyVal = prefix + "AnyVal"
  final val ArrayEquals = prefix + "ArrayEquals"
  final val AsInstanceOf = prefix + "AsInstanceOf"
  final val DefaultArguments = prefix + "DefaultArguments"
  final val EitherProjectionPartial = prefix + "EitherProjectionPartial"
  final val Enumeration = prefix + "Enumeration"
  final val Equals = prefix + "Equals"
  final val ExplicitImplicitTypes = prefix + "ExplicitImplicitTypes"
  final val FinalCaseClass = prefix + "FinalCaseClass"
  final val FinalVal = "org.wartremover.warts.FinalVal" //used in current module
  final val ForbidInference = prefix + "ForbidInference"
  final val ImplicitConversion = prefix + "ImplicitConversion"
  final val ImplicitParameter = prefix + "ImplicitParameter"
  final val IsInstanceOf = prefix + "IsInstanceOf"
  final val JavaSerializable = prefix + "JavaSerializable"
  final val JavaConversions = prefix + "JavaConversions"
  final val LeakingSealed = prefix + "LeakingSealed"
  final val MutableDataStructures = prefix + "MutableDataStructures"
  final val NonUnitStatements = prefix + "NonUnitStatements"
  final val Nothing = prefix + "Nothing"
  final val Null = prefix + "Null"
  final val Option2Iterable = prefix + "Option2Iterable"
  final val OptionPartial = prefix + "OptionPartial"
  final val Overloading = prefix + "Overloading"
  final val Product = prefix + "Product"
  final val PublicInference = prefix + "PublicInference"
  final val Recursion = prefix + "Recursion"
  final val Return = prefix + "Return"
  final val Serializable = prefix + "Serializable"
  final val StringPlusAny = prefix + "StringPlusAny"
  final val Throw = prefix + "Throw"
  final val ToString = prefix + "ToString"
  final val TraversableOps = prefix + "TraversableOps"
  final val TryPartial = prefix + "TryPartial"
  final val Unsafe = prefix + "Unsafe"
  final val Var = prefix + "Var"
}
