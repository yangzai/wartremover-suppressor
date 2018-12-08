package org.wartremover.suppressor

@SuppressWarnings(Array(Wart.FinalVal))
object ContribWart {
  private final val prefix = Core.root + "contrib.warts."
  final val Apply = prefix + "Apply"
  final val ExposedTuples = prefix + "ExposedTuples"
  final val MissingOverride = prefix + "MissingOverride"
  final val NoNeedForMonad = prefix + "NoNeedForMonad"
  final val OldTime = prefix + "OldTime"
  final val RefinedClasstag = prefix + "RefinedClasstag"
  final val SealedCaseClass = prefix + "SealedCaseClass"
  final val SomeApply = prefix + "SomeApply"
  final val SymbolicName = prefix + "SymbolicName"
  final val UnintendedLaziness = prefix + "UnintendedLaziness"
  final val UnsafeInheritance = prefix + "UnsafeInheritance"
}
