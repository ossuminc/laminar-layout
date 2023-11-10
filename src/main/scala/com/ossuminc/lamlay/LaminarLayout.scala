package com.ossuminc.lamlay

import scala.scalajs.js
import org.scalajs.dom

import scala.scalajs.js.annotation.*
import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveElement

@main
def main(): Unit = {
  lazy val appContainer = dom.document.querySelector("#appContent")
  renderOnDomContentLoaded(appContainer, LaminarLayout.appContent())
}

object LaminarLayout {

  def appContent(): ReactiveElement.Base = {
    div(
      h1("Hello Scala.js and Vite")
    )
  }

}
