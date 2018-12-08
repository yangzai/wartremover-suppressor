package org.wartremover

package object suppressor {
  @SuppressWarnings(Array(Wart.FinalVal))
  private [suppressor] object Core {
    final val root = "org.wartremover."
  }
}
