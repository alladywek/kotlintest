package com.sksamuel.kotest.junit5

import io.kotest.Spec
import io.kotest.shouldBe
import io.kotest.specs.StringSpec

class StringSpecExceptionInBeforeSpec : StringSpec() {

  init {
    "a failing test" {
      1 shouldBe 2
    }

    "a passing test" {
      1 shouldBe 1
    }
  }

  override fun beforeSpec(spec: Spec) {
    throw RuntimeException("zopp!!")
  }

}
