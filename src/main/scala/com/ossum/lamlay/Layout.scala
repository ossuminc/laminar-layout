package com.ossum.lamlay

import scala.scalajs.js
import scalajs.js.JSConverters.*
import org.scalajs.dom
import scala.scalajs.js.annotation.*
import com.raquo.laminar.api.L.{*, given}


object Layout {

  case class MenuItem(
    name: String,
    urlFromBase: String,
    children: Seq[MenuItem]
  )
  case class Builder() {
    private var header: Option[HtmlElement] = None
    private var footer: Option[HtmlElement] = None
    private var columns: Seq[HtmlElement] = Seq.empty

    def numColumns: Int = columns.length

    def addMenu(menu: List[MenuItem]): Builder = { this }
    def addHeader(column: HtmlElement): Builder = { this }
    def addFooter(): Builder = { this }
    def addColumn(column: HtmlElement): Builder = {
      columns = columns :+ column
      this
    }
    def withIcon(icon: String): Builder = {
      this
    }
    def build(): HtmlElement = {
      val head = header.map(h => div(width:= "100%", h))
      val foot = footer.map(f => div( width:="100%", f))
      columns.length match {
        case 1 => div(width:="100%", columns.head )
        case 2 =>
          val cols = columns.map(td(className:="col", _))
          val row = tr(className:="row", cols)
          val body = tbody(className:="tbody", row)
          val tbl = table(body)
          div(tbl)
      }
    }
  }
}
