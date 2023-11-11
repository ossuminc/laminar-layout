package com.ossuminc.lamlay

import scala.scalajs.js
import scalajs.js.JSConverters.*
import org.scalajs.dom
import scala.scalajs.js.annotation.*
import com.raquo.laminar.api.L.{*, given}


object Layout {

  case class Builder() {
    private var columns: Seq[HtmlElement] = Seq.empty
    def withIcon(icon: String): Builder = {
      this
    }
    def withColumnsColumns(cols: HtmlElement*): Builder = {
      columns = columns ++ cols
      this
    }

    def build(): HtmlElement = {
      columns.length match {
        case 1 => div(width:="100%", columns.head )
        case _ => div(columns)
      }
    }
  }
}
