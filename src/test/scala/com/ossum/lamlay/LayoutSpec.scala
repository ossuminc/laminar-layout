package com.ossum.lamlay

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.must.Matchers
import com.raquo.laminar.api.L.{*,given}

class LayoutSpec extends AnyWordSpec with Matchers {

  "Layout" should {
    "handle columns" in {
      val layout = Layout.Builder().addColumn(div("column 1")).addColumn(div("column2"))
      layout.numColumns mustBe(2)
    }
  }

}
